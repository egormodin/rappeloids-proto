import Foundation

// MARK: - Binary Protobuf Wire Format Codec (Proto3)

public enum ProtoWireType: UInt64 {
    case varint = 0
    case fixed64 = 1
    case lengthDelimited = 2
    case startGroup = 3
    case endGroup = 4
    case fixed32 = 5
}

public protocol ProtoBinaryMessage: Equatable, Hashable, Sendable {
    init()
    func encodeToProtoWire(writer: inout ProtoWireWriter)
    mutating func decodeFieldFromProtoWire(fieldNumber: Int, wireType: ProtoWireType, reader: inout ProtoWireReader) throws
}

extension ProtoBinaryMessage {
    public func toByteArray() -> Data {
        var writer = ProtoWireWriter()
        encodeToProtoWire(writer: &writer)
        return writer.toData()
    }

    public static func parseFrom(_ rawData: Data) throws -> Self {
        var messageInstance = Self()
        var reader = ProtoWireReader(data: rawData)
        while !reader.isAtEnd {
            let (fieldNumber, wireType) = try reader.readTag()
            if fieldNumber == 0 {
                break
            }
            try messageInstance.decodeFieldFromProtoWire(
                fieldNumber: fieldNumber,
                wireType: wireType,
                reader: &reader
            )
        }
        return messageInstance
    }
}

public enum ProtoWireError: Error, LocalizedError {
    case truncatedMessage
    case malformedVarint
    case invalidWireType(UInt64)
    case invalidUtf8String

    public var errorDescription: String? {
        switch self {
        case .truncatedMessage:
            return "Protobuf wire message ended unexpectedly."
        case .malformedVarint:
            return "Protobuf wire varint exceeded 64 bits."
        case .invalidWireType(let rawWireType):
            return "Invalid Protobuf wire type: \(rawWireType)."
        case .invalidUtf8String:
            return "Protobuf string field contained invalid UTF-8 bytes."
        }
    }
}

public struct ProtoWireWriter: Sendable {
    private var buffer: Data

    public init(capacity: Int = 256) {
        self.buffer = Data()
        self.buffer.reserveCapacity(capacity)
    }

    public func toData() -> Data {
        return buffer
    }

    public mutating func writeTag(fieldNumber: Int, wireType: ProtoWireType) {
        let tagValue = (UInt64(fieldNumber) << 3) | wireType.rawValue
        writeRawVarint(tagValue)
    }

    public mutating func writeRawVarint(_ rawValue: UInt64) {
        var remainingValue = rawValue
        while remainingValue >= 0x80 {
            buffer.append(UInt8((remainingValue & 0x7F) | 0x80))
            remainingValue >>= 7
        }
        buffer.append(UInt8(remainingValue & 0x7F))
    }

    public mutating func writeRawFixed64(_ rawValue: UInt64) {
        var littleEndianValue = rawValue.littleEndian
        withUnsafeBytes(of: &littleEndianValue) { bytePointer in
            buffer.append(contentsOf: bytePointer)
        }
    }

    public mutating func writeRawFixed32(_ rawValue: UInt32) {
        var littleEndianValue = rawValue.littleEndian
        withUnsafeBytes(of: &littleEndianValue) { bytePointer in
            buffer.append(contentsOf: bytePointer)
        }
    }

    public mutating func writeBoolField(fieldNumber: Int, value: Bool) {
        guard value else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(1)
    }

    public mutating func writeOptionalBoolField(fieldNumber: Int, value: Bool?) {
        guard let unwrappedValue = value else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(unwrappedValue ? 1 : 0)
    }

    public mutating func writeInt32Field(fieldNumber: Int, value: Int32) {
        guard value != 0 else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(UInt64(bitPattern: Int64(value)))
    }

    public mutating func writeOptionalInt32Field(fieldNumber: Int, value: Int32?) {
        guard let unwrappedValue = value else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(UInt64(bitPattern: Int64(unwrappedValue)))
    }

    public mutating func writeInt64Field(fieldNumber: Int, value: Int64) {
        guard value != 0 else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(UInt64(bitPattern: value))
    }

    public mutating func writeEnumField(fieldNumber: Int, rawNumber: Int32) {
        guard rawNumber != 0 else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .varint)
        writeRawVarint(UInt64(bitPattern: Int64(rawNumber)))
    }

    public mutating func writeDoubleField(fieldNumber: Int, value: Double) {
        guard value != 0.0 else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .fixed64)
        writeRawFixed64(value.bitPattern)
    }

    public mutating func writeStringField(fieldNumber: Int, value: String, alwaysEncode: Bool = false) {
        if !alwaysEncode && value.isEmpty { return }
        let utf8Data = Data(value.utf8)
        writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
        writeRawVarint(UInt64(utf8Data.count))
        buffer.append(utf8Data)
    }

    public mutating func writeBytesField(fieldNumber: Int, value: Data) {
        guard !value.isEmpty else { return }
        writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
        writeRawVarint(UInt64(value.count))
        buffer.append(value)
    }

    public mutating func writeMessageField<MessageType: ProtoBinaryMessage>(
        fieldNumber: Int,
        message: MessageType,
        alwaysEncode: Bool = false
    ) {
        let nestedData = message.toByteArray()
        if !alwaysEncode && nestedData.isEmpty { return }
        writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
        writeRawVarint(UInt64(nestedData.count))
        buffer.append(nestedData)
    }

    public mutating func writeOptionalMessageField<MessageType: ProtoBinaryMessage>(
        fieldNumber: Int,
        message: MessageType?
    ) {
        guard let unwrappedMessage = message else { return }
        let nestedData = unwrappedMessage.toByteArray()
        writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
        writeRawVarint(UInt64(nestedData.count))
        buffer.append(nestedData)
    }

    public mutating func writeRepeatedStringField(fieldNumber: Int, values: [String]) {
        for elementValue in values {
            let utf8Data = Data(elementValue.utf8)
            writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
            writeRawVarint(UInt64(utf8Data.count))
            buffer.append(utf8Data)
        }
    }

    public mutating func writeRepeatedMessageField<MessageType: ProtoBinaryMessage>(
        fieldNumber: Int,
        messages: [MessageType]
    ) {
        for elementMessage in messages {
            let nestedData = elementMessage.toByteArray()
            writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
            writeRawVarint(UInt64(nestedData.count))
            buffer.append(nestedData)
        }
    }

    public mutating func writeStringToStringMapField(fieldNumber: Int, mapEntries: [String: String]) {
        let sortedKeys = mapEntries.keys.sorted()
        for entryKey in sortedKeys {
            let entryValue = mapEntries[entryKey] ?? ""
            var entryWriter = ProtoWireWriter()
            entryWriter.writeStringField(fieldNumber: 1, value: entryKey, alwaysEncode: true)
            entryWriter.writeStringField(fieldNumber: 2, value: entryValue, alwaysEncode: true)
            let entryBytes = entryWriter.toData()
            writeTag(fieldNumber: fieldNumber, wireType: .lengthDelimited)
            writeRawVarint(UInt64(entryBytes.count))
            buffer.append(entryBytes)
        }
    }
}

public struct ProtoWireReader: Sendable {
    private let bytes: [UInt8]
    private var cursorPosition: Int
    private let endPosition: Int

    public init(data: Data) {
        self.bytes = Array(data)
        self.cursorPosition = 0
        self.endPosition = self.bytes.count
    }

    private init(bytes: [UInt8], startIndex: Int, endIndex: Int) {
        self.bytes = bytes
        self.cursorPosition = startIndex
        self.endPosition = endIndex
    }

    public var isAtEnd: Bool {
        return cursorPosition >= endPosition
    }

    public mutating func readTag() throws -> (Int, ProtoWireType) {
        if isAtEnd {
            return (0, .varint)
        }
        let rawTag = try readRawVarint()
        let fieldNumber = Int(rawTag >> 3)
        let rawWireType = rawTag & 0x07
        guard let wireType = ProtoWireType(rawValue: rawWireType) else {
            throw ProtoWireError.invalidWireType(rawWireType)
        }
        return (fieldNumber, wireType)
    }

    public mutating func readRawVarint() throws -> UInt64 {
        var resultValue: UInt64 = 0
        var bitShift: UInt64 = 0
        while cursorPosition < endPosition {
            let currentByte = bytes[cursorPosition]
            cursorPosition += 1
            resultValue |= UInt64(currentByte & 0x7F) << bitShift
            if (currentByte & 0x80) == 0 {
                return resultValue
            }
            bitShift += 7
            if bitShift >= 64 {
                throw ProtoWireError.malformedVarint
            }
        }
        throw ProtoWireError.truncatedMessage
    }

    public mutating func readRawFixed64() throws -> UInt64 {
        guard cursorPosition + 8 <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        var resultValue: UInt64 = 0
        for byteOffset in 0..<8 {
            resultValue |= UInt64(bytes[cursorPosition + byteOffset]) << (UInt64(byteOffset) * 8)
        }
        cursorPosition += 8
        return resultValue
    }

    public mutating func readRawFixed32() throws -> UInt32 {
        guard cursorPosition + 4 <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        var resultValue: UInt32 = 0
        for byteOffset in 0..<4 {
            resultValue |= UInt32(bytes[cursorPosition + byteOffset]) << (UInt32(byteOffset) * 8)
        }
        cursorPosition += 4
        return resultValue
    }

    public mutating func readBool() throws -> Bool {
        let rawValue = try readRawVarint()
        return rawValue != 0
    }

    public mutating func readInt32() throws -> Int32 {
        let rawValue = try readRawVarint()
        return Int32(truncatingIfNeeded: rawValue)
    }

    public mutating func readInt64() throws -> Int64 {
        let rawValue = try readRawVarint()
        return Int64(bitPattern: rawValue)
    }

    public mutating func readDouble(wireType: ProtoWireType) throws -> Double {
        switch wireType {
        case .fixed64:
            let bitPattern = try readRawFixed64()
            return Double(bitPattern: bitPattern)
        case .fixed32:
            let bitPattern = try readRawFixed32()
            return Double(Float(bitPattern: bitPattern))
        case .varint:
            let intValue = try readInt64()
            return Double(intValue)
        default:
            try skipField(wireType: wireType)
            return 0.0
        }
    }

    public mutating func readString() throws -> String {
        let byteCount = Int(try readRawVarint())
        guard byteCount >= 0, cursorPosition + byteCount <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        let slice = bytes[cursorPosition..<(cursorPosition + byteCount)]
        cursorPosition += byteCount
        return String(decoding: slice, as: UTF8.self)
    }

    public mutating func readBytes() throws -> Data {
        let byteCount = Int(try readRawVarint())
        guard byteCount >= 0, cursorPosition + byteCount <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        let sliceData = Data(bytes[cursorPosition..<(cursorPosition + byteCount)])
        cursorPosition += byteCount
        return sliceData
    }

    public mutating func readMessage<MessageType: ProtoBinaryMessage>() throws -> MessageType {
        let byteCount = Int(try readRawVarint())
        guard byteCount >= 0, cursorPosition + byteCount <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        var nestedReader = ProtoWireReader(
            bytes: bytes,
            startIndex: cursorPosition,
            endIndex: cursorPosition + byteCount
        )
        cursorPosition += byteCount
        var nestedMessage = MessageType()
        while !nestedReader.isAtEnd {
            let (nestedFieldNumber, nestedWireType) = try nestedReader.readTag()
            if nestedFieldNumber == 0 {
                break
            }
            try nestedMessage.decodeFieldFromProtoWire(
                fieldNumber: nestedFieldNumber,
                wireType: nestedWireType,
                reader: &nestedReader
            )
        }
        return nestedMessage
    }

    public mutating func readStringToStringMapEntry() throws -> (key: String, value: String) {
        let byteCount = Int(try readRawVarint())
        guard byteCount >= 0, cursorPosition + byteCount <= endPosition else {
            throw ProtoWireError.truncatedMessage
        }
        var entryReader = ProtoWireReader(
            bytes: bytes,
            startIndex: cursorPosition,
            endIndex: cursorPosition + byteCount
        )
        cursorPosition += byteCount
        var entryKey = ""
        var entryValue = ""
        while !entryReader.isAtEnd {
            let (entryFieldNumber, entryWireType) = try entryReader.readTag()
            switch (entryFieldNumber, entryWireType) {
            case (1, .lengthDelimited):
                entryKey = try entryReader.readString()
            case (2, .lengthDelimited):
                entryValue = try entryReader.readString()
            default:
                try entryReader.skipField(wireType: entryWireType)
            }
        }
        return (entryKey, entryValue)
    }

    public mutating func skipField(wireType: ProtoWireType) throws {
        switch wireType {
        case .varint:
            _ = try readRawVarint()
        case .fixed64:
            guard cursorPosition + 8 <= endPosition else {
                throw ProtoWireError.truncatedMessage
            }
            cursorPosition += 8
        case .lengthDelimited:
            let byteCount = Int(try readRawVarint())
            guard byteCount >= 0, cursorPosition + byteCount <= endPosition else {
                throw ProtoWireError.truncatedMessage
            }
            cursorPosition += byteCount
        case .fixed32:
            guard cursorPosition + 4 <= endPosition else {
                throw ProtoWireError.truncatedMessage
            }
            cursorPosition += 4
        case .startGroup:
            while !isAtEnd {
                let (_, innerWireType) = try readTag()
                if innerWireType == .endGroup {
                    break
                }
                try skipField(wireType: innerWireType)
            }
        case .endGroup:
            break
        }
    }
}

// MARK: - Standard Well-Known Protobuf & Google Types

public struct ProtoEmpty: ProtoBinaryMessage {
    public init() {}

    public static func getDefaultInstance() -> ProtoEmpty {
        return ProtoEmpty()
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {}

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        try reader.skipField(wireType: wireType)
    }
}

public struct ProtoFieldMask: ProtoBinaryMessage {
    public var paths: [String] = []

    public var pathsList: [String] { paths }
    public var pathsCount: Int { paths.count }

    public init() {}

    public init(paths: [String]) {
        self.paths = paths
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedStringField(fieldNumber: 1, values: paths)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            paths.append(try reader.readString())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoDuration: ProtoBinaryMessage {
    public var seconds: Int64 = 0
    public var nanos: Int32 = 0

    public init() {}

    public init(seconds: Int64, nanos: Int32 = 0) {
        self.seconds = seconds
        self.nanos = nanos
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt64Field(fieldNumber: 1, value: seconds)
        writer.writeInt32Field(fieldNumber: 2, value: nanos)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint):
            seconds = try reader.readInt64()
        case (2, .varint):
            nanos = try reader.readInt32()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoTimestamp: ProtoBinaryMessage {
    public var seconds: Int64 = 0
    public var nanos: Int32 = 0

    public init() {}

    public init(seconds: Int64, nanos: Int32 = 0) {
        self.seconds = seconds
        self.nanos = nanos
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt64Field(fieldNumber: 1, value: seconds)
        writer.writeInt32Field(fieldNumber: 2, value: nanos)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint):
            seconds = try reader.readInt64()
        case (2, .varint):
            nanos = try reader.readInt32()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoDate: ProtoBinaryMessage {
    public var year: Int32 = 0
    public var month: Int32 = 0
    public var day: Int32 = 0

    public init() {}

    public init(year: Int32, month: Int32, day: Int32) {
        self.year = year
        self.month = month
        self.day = day
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: year)
        writer.writeInt32Field(fieldNumber: 2, value: month)
        writer.writeInt32Field(fieldNumber: 3, value: day)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint):
            year = try reader.readInt32()
        case (2, .varint):
            month = try reader.readInt32()
        case (3, .varint):
            day = try reader.readInt32()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoTimeZone: ProtoBinaryMessage {
    public var id: String = ""
    public var version: String = ""

    public init() {}

    public init(id: String, version: String = "") {
        self.id = id
        self.version = version
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: id)
        writer.writeStringField(fieldNumber: 2, value: version)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            id = try reader.readString()
        case (2, .lengthDelimited):
            version = try reader.readString()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoDateTime: ProtoBinaryMessage {
    public var year: Int32 = 0
    public var month: Int32 = 0
    public var day: Int32 = 0
    public var hours: Int32 = 0
    public var minutes: Int32 = 0
    public var seconds: Int32 = 0
    public var nanos: Int32 = 0
    public var utcOffset: ProtoDuration? = nil
    public var timeZone: ProtoTimeZone? = nil

    public var hasUtcOffset: Bool { utcOffset != nil }
    public var hasTimeZone: Bool { timeZone != nil }

    public init() {}

    public init(
        year: Int32 = 0,
        month: Int32 = 0,
        day: Int32 = 0,
        hours: Int32 = 0,
        minutes: Int32 = 0,
        seconds: Int32 = 0,
        nanos: Int32 = 0,
        utcOffset: ProtoDuration? = nil,
        timeZone: ProtoTimeZone? = nil
    ) {
        self.year = year
        self.month = month
        self.day = day
        self.hours = hours
        self.minutes = minutes
        self.seconds = seconds
        self.nanos = nanos
        self.utcOffset = utcOffset
        self.timeZone = timeZone
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: year)
        writer.writeInt32Field(fieldNumber: 2, value: month)
        writer.writeInt32Field(fieldNumber: 3, value: day)
        writer.writeInt32Field(fieldNumber: 4, value: hours)
        writer.writeInt32Field(fieldNumber: 5, value: minutes)
        writer.writeInt32Field(fieldNumber: 6, value: seconds)
        writer.writeInt32Field(fieldNumber: 7, value: nanos)
        writer.writeOptionalMessageField(fieldNumber: 8, message: utcOffset)
        writer.writeOptionalMessageField(fieldNumber: 9, message: timeZone)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint):
            year = try reader.readInt32()
        case (2, .varint):
            month = try reader.readInt32()
        case (3, .varint):
            day = try reader.readInt32()
        case (4, .varint):
            hours = try reader.readInt32()
        case (5, .varint):
            minutes = try reader.readInt32()
        case (6, .varint):
            seconds = try reader.readInt32()
        case (7, .varint):
            nanos = try reader.readInt32()
        case (8, .lengthDelimited):
            utcOffset = try reader.readMessage()
            timeZone = nil
        case (9, .lengthDelimited):
            timeZone = try reader.readMessage()
            utcOffset = nil
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ProtoLatLng: ProtoBinaryMessage {
    public var latitude: Double = 0.0
    public var longitude: Double = 0.0

    public init() {}

    public init(latitude: Double, longitude: Double) {
        self.latitude = latitude
        self.longitude = longitude
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeDoubleField(fieldNumber: 1, value: latitude)
        writer.writeDoubleField(fieldNumber: 2, value: longitude)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch fieldNumber {
        case 1:
            latitude = try reader.readDouble(wireType: wireType)
        case 2:
            longitude = try reader.readDouble(wireType: wireType)
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}
