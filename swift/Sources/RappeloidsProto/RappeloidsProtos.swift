import Foundation

// MARK: - common.proto

public struct GeoPoint: ProtoBinaryMessage {
    public var latitude: Double = 0.0
    public var longitude: Double = 0.0
    public var elevationMeters: Double = 0.0

    public init() {}

    public init(
        latitude: Double = 0.0,
        longitude: Double = 0.0,
        elevationMeters: Double = 0.0
    ) {
        self.latitude = latitude
        self.longitude = longitude
        self.elevationMeters = elevationMeters
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeDoubleField(fieldNumber: 1, value: latitude)
        writer.writeDoubleField(fieldNumber: 2, value: longitude)
        writer.writeDoubleField(fieldNumber: 3, value: elevationMeters)
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
        case 3:
            elevationMeters = try reader.readDouble(wireType: wireType)
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct Price: ProtoBinaryMessage {
    public var amount: Double = 0.0
    public var currencyCode: String = ""

    public init() {}

    public init(amount: Double = 0.0, currencyCode: String = "") {
        self.amount = amount
        self.currencyCode = currencyCode
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeDoubleField(fieldNumber: 1, value: amount)
        writer.writeStringField(fieldNumber: 2, value: currencyCode)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, _):
            amount = try reader.readDouble(wireType: wireType)
        case (2, .lengthDelimited):
            currencyCode = try reader.readString()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct Money: ProtoBinaryMessage {
    public var currencyCode: String = ""
    public var units: Int64 = 0
    public var nanos: Int32 = 0

    public init() {}

    public init(currencyCode: String = "", units: Int64 = 0, nanos: Int32 = 0) {
        self.currencyCode = currencyCode
        self.units = units
        self.nanos = nanos
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: currencyCode)
        writer.writeInt64Field(fieldNumber: 2, value: units)
        writer.writeInt32Field(fieldNumber: 3, value: nanos)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            currencyCode = try reader.readString()
        case (2, .varint):
            units = try reader.readInt64()
        case (3, .varint):
            nanos = try reader.readInt32()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct RouteSchedule: ProtoBinaryMessage {
    public struct ExactTimes: ProtoBinaryMessage {
        public var departureTimeStorage: ProtoDateTime? = nil
        public var arrivalTimeStorage: ProtoDateTime? = nil

        public var departureTime: ProtoDateTime {
            get { departureTimeStorage ?? ProtoDateTime() }
            set { departureTimeStorage = newValue }
        }
        public var arrivalTime: ProtoDateTime {
            get { arrivalTimeStorage ?? ProtoDateTime() }
            set { arrivalTimeStorage = newValue }
        }
        public var hasDepartureTime: Bool { departureTimeStorage != nil }
        public var hasArrivalTime: Bool { arrivalTimeStorage != nil }

        public init() {}

        public init(departureTime: ProtoDateTime? = nil, arrivalTime: ProtoDateTime? = nil) {
            self.departureTimeStorage = departureTime
            self.arrivalTimeStorage = arrivalTime
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeOptionalMessageField(fieldNumber: 1, message: departureTimeStorage)
            writer.writeOptionalMessageField(fieldNumber: 2, message: arrivalTimeStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited):
                departureTimeStorage = try reader.readMessage()
            case (2, .lengthDelimited):
                arrivalTimeStorage = try reader.readMessage()
            default:
                try reader.skipField(wireType: wireType)
            }
        }
    }

    public var exactTimesStorage: ExactTimes? = nil
    public var durationStorage: ProtoDuration? = nil

    public var exactTimes: ExactTimes {
        get { exactTimesStorage ?? ExactTimes() }
        set {
            exactTimesStorage = newValue
            durationStorage = nil
        }
    }
    public var duration: ProtoDuration {
        get { durationStorage ?? ProtoDuration() }
        set {
            durationStorage = newValue
            exactTimesStorage = nil
        }
    }
    public var hasExactTimes: Bool { exactTimesStorage != nil }
    public var hasDuration: Bool { durationStorage != nil }

    public init() {}

    public init(exactTimes: ExactTimes? = nil, duration: ProtoDuration? = nil) {
        self.exactTimesStorage = exactTimes
        self.durationStorage = duration
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: exactTimesStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: durationStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            exactTimesStorage = try reader.readMessage()
            durationStorage = nil
        case (2, .lengthDelimited):
            durationStorage = try reader.readMessage()
            exactTimesStorage = nil
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct Duration: ProtoBinaryMessage {
    public struct ExactDates: ProtoBinaryMessage {
        public var startDateStorage: ProtoDate? = nil
        public var endDateStorage: ProtoDate? = nil

        public var startDate: ProtoDate {
            get { startDateStorage ?? ProtoDate() }
            set { startDateStorage = newValue }
        }
        public var endDate: ProtoDate {
            get { endDateStorage ?? ProtoDate() }
            set { endDateStorage = newValue }
        }
        public var hasStartDate: Bool { startDateStorage != nil }
        public var hasEndDate: Bool { endDateStorage != nil }

        public init() {}

        public init(startDate: ProtoDate? = nil, endDate: ProtoDate? = nil) {
            self.startDateStorage = startDate
            self.endDateStorage = endDate
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeOptionalMessageField(fieldNumber: 1, message: startDateStorage)
            writer.writeOptionalMessageField(fieldNumber: 2, message: endDateStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited):
                startDateStorage = try reader.readMessage()
            case (2, .lengthDelimited):
                endDateStorage = try reader.readMessage()
            default:
                try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct TextDuration: ProtoBinaryMessage {
        public var dates: String = ""
        public var durationStorage: ProtoDuration? = nil

        public var duration: ProtoDuration {
            get { durationStorage ?? ProtoDuration() }
            set { durationStorage = newValue }
        }
        public var hasDuration: Bool { durationStorage != nil }

        public init() {}

        public init(dates: String = "", duration: ProtoDuration? = nil) {
            self.dates = dates
            self.durationStorage = duration
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: dates)
            writer.writeOptionalMessageField(fieldNumber: 2, message: durationStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited):
                dates = try reader.readString()
            case (2, .lengthDelimited):
                durationStorage = try reader.readMessage()
            default:
                try reader.skipField(wireType: wireType)
            }
        }
    }

    public var exactDatesStorage: ExactDates? = nil
    public var textDurationStorage: TextDuration? = nil

    public var exactDates: ExactDates {
        get { exactDatesStorage ?? ExactDates() }
        set {
            exactDatesStorage = newValue
            textDurationStorage = nil
        }
    }
    public var textDuration: TextDuration {
        get { textDurationStorage ?? TextDuration() }
        set {
            textDurationStorage = newValue
            exactDatesStorage = nil
        }
    }
    public var hasExactDates: Bool { exactDatesStorage != nil }
    public var hasTextDuration: Bool { textDurationStorage != nil }

    public init() {}

    public init(exactDates: ExactDates? = nil, textDuration: TextDuration? = nil) {
        self.exactDatesStorage = exactDates
        self.textDurationStorage = textDuration
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: exactDatesStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: textDurationStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            exactDatesStorage = try reader.readMessage()
            textDurationStorage = nil
        case (2, .lengthDelimited):
            textDurationStorage = try reader.readMessage()
            exactDatesStorage = nil
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - users.proto

public struct User: ProtoBinaryMessage, Identifiable {
    public var id: String { name.isEmpty ? email : name }

    public enum Status: Int32, CaseIterable, Sendable, Hashable {
        case statusUnspecified = 0
        case pending = 1
        case approved = 2
        case rejected = 3

        public static let STATUS_UNSPECIFIED: Status = .statusUnspecified
        public static let PENDING: Status = .pending
        public static let APPROVED: Status = .approved
        public static let REJECTED: Status = .rejected

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> Status? { Status(rawValue: rawNumber) }
    }

    public enum Role: Int32, CaseIterable, Sendable, Hashable {
        case roleUnspecified = 0
        case user = 1
        case admin = 2
        case boss = 3
        case editor = 4

        public static let ROLE_UNSPECIFIED: Role = .roleUnspecified
        public static let USER: Role = .user
        public static let ADMIN: Role = .admin
        public static let BOSS: Role = .boss
        public static let EDITOR: Role = .editor

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> Role? { Role(rawValue: rawNumber) }
    }

    public enum Theme: Int32, CaseIterable, Sendable, Hashable {
        case themeUnspecified = 0
        case dark = 1
        case light = 2

        public static let THEME_UNSPECIFIED: Theme = .themeUnspecified
        public static let DARK: Theme = .dark
        public static let LIGHT: Theme = .light
        public static let DARK_VALUE: Int32 = 1
        public static let LIGHT_VALUE: Int32 = 2

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> Theme? { Theme(rawValue: rawNumber) }
    }

    public enum ColorScheme: Int32, CaseIterable, Sendable, Hashable {
        case colorSchemeUnspecified = 0
        case ocean = 1
        case sedona = 2
        case alpine = 3
        case glacier = 4
        case sunset = 5
        case cyber = 6
        case monochrome = 7
        case nordic = 8
        case sahara = 9
        case amazon = 10
        case lavender = 11
        case volcano = 12
        case cherry = 13
        case sapphire = 14
        case emerald = 15
        case coffee = 16
        case autumn = 17
        case midnight = 18
        case coral = 19
        case northernAurora = 20
        case indigo = 21
        case canyonAmber = 22
        case slateBlue = 23
        case desertSage = 24
        case plumVelvet = 25

        public static let COLOR_SCHEME_UNSPECIFIED: ColorScheme = .colorSchemeUnspecified
        public static let OCEAN: ColorScheme = .ocean
        public static let SEDONA: ColorScheme = .sedona
        public static let ALPINE: ColorScheme = .alpine
        public static let GLACIER: ColorScheme = .glacier
        public static let SUNSET: ColorScheme = .sunset
        public static let CYBER: ColorScheme = .cyber
        public static let MONOCHROME: ColorScheme = .monochrome
        public static let NORDIC: ColorScheme = .nordic
        public static let SAHARA: ColorScheme = .sahara
        public static let AMAZON: ColorScheme = .amazon
        public static let LAVENDER: ColorScheme = .lavender
        public static let VOLCANO: ColorScheme = .volcano
        public static let CHERRY: ColorScheme = .cherry
        public static let SAPPHIRE: ColorScheme = .sapphire
        public static let EMERALD: ColorScheme = .emerald
        public static let COFFEE: ColorScheme = .coffee
        public static let AUTUMN: ColorScheme = .autumn
        public static let MIDNIGHT: ColorScheme = .midnight
        public static let CORAL: ColorScheme = .coral
        public static let NORTHERN_AURORA: ColorScheme = .northernAurora
        public static let INDIGO: ColorScheme = .indigo
        public static let CANYON_AMBER: ColorScheme = .canyonAmber
        public static let SLATE_BLUE: ColorScheme = .slateBlue
        public static let DESERT_SAGE: ColorScheme = .desertSage
        public static let PLUM_VELVET: ColorScheme = .plumVelvet
        public static let OCEAN_VALUE: Int32 = 1

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> ColorScheme? { ColorScheme(rawValue: rawNumber) }
    }

    public enum UnitSystem: Int32, CaseIterable, Sendable, Hashable {
        case unitSystemUnspecified = 0
        case imperial = 1
        case metric = 2

        public static let UNIT_SYSTEM_UNSPECIFIED: UnitSystem = .unitSystemUnspecified
        public static let IMPERIAL: UnitSystem = .imperial
        public static let METRIC: UnitSystem = .metric
        public static let IMPERIAL_VALUE: Int32 = 1
        public static let METRIC_VALUE: Int32 = 2

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> UnitSystem? { UnitSystem(rawValue: rawNumber) }
    }

    public enum MapOption: Int32, CaseIterable, Sendable, Hashable {
        case mapOptionUnspecified = 0
        case openTopo = 1
        case locusOutdoors = 2
        case googleStreets = 3
        case googleHybrid = 4
        case googleTerrain = 5
        case usgs75Quads = 6

        public static let MAP_OPTION_UNSPECIFIED: MapOption = .mapOptionUnspecified
        public static let OPEN_TOPO: MapOption = .openTopo
        public static let LOCUS_OUTDOORS: MapOption = .locusOutdoors
        public static let GOOGLE_STREETS: MapOption = .googleStreets
        public static let GOOGLE_HYBRID: MapOption = .googleHybrid
        public static let GOOGLE_TERRAIN: MapOption = .googleTerrain
        public static let USGS_7_5_QUADS: MapOption = .usgs75Quads
        public static let OPEN_TOPO_VALUE: Int32 = 1

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> MapOption? { MapOption(rawValue: rawNumber) }
    }

    public var name: String = ""
    public var email: String = ""
    public var displayName: String = ""
    public var avatarUrl: String = ""
    public var role: Role = .roleUnspecified
    public var status: Status = .statusUnspecified
    public var secondaryEmail: String = ""
    public var theme: Theme = .themeUnspecified
    public var colorScheme: ColorScheme = .colorSchemeUnspecified
    public var isHiddenInHistory: Bool = false
    public var unitSystem: UnitSystem = .unitSystemUnspecified
    public var mapOption: MapOption = .mapOptionUnspecified

    public init() {}

    public init(
        name: String = "",
        email: String = "",
        displayName: String = "",
        avatarUrl: String = "",
        role: Role = .roleUnspecified,
        status: Status = .statusUnspecified,
        secondaryEmail: String = "",
        theme: Theme = .themeUnspecified,
        colorScheme: ColorScheme = .colorSchemeUnspecified,
        isHiddenInHistory: Bool = false,
        unitSystem: UnitSystem = .unitSystemUnspecified,
        mapOption: MapOption = .mapOptionUnspecified
    ) {
        self.name = name
        self.email = email
        self.displayName = displayName
        self.avatarUrl = avatarUrl
        self.role = role
        self.status = status
        self.secondaryEmail = secondaryEmail
        self.theme = theme
        self.colorScheme = colorScheme
        self.isHiddenInHistory = isHiddenInHistory
        self.unitSystem = unitSystem
        self.mapOption = mapOption
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 3, value: email)
        writer.writeStringField(fieldNumber: 4, value: displayName)
        writer.writeStringField(fieldNumber: 5, value: avatarUrl)
        writer.writeEnumField(fieldNumber: 6, rawNumber: role.rawValue)
        writer.writeEnumField(fieldNumber: 7, rawNumber: status.rawValue)
        writer.writeStringField(fieldNumber: 8, value: secondaryEmail)
        writer.writeEnumField(fieldNumber: 9, rawNumber: theme.rawValue)
        writer.writeEnumField(fieldNumber: 10, rawNumber: colorScheme.rawValue)
        writer.writeBoolField(fieldNumber: 11, value: isHiddenInHistory)
        writer.writeEnumField(fieldNumber: 12, rawNumber: unitSystem.rawValue)
        writer.writeEnumField(fieldNumber: 13, rawNumber: mapOption.rawValue)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            name = try reader.readString()
        case (3, .lengthDelimited):
            email = try reader.readString()
        case (4, .lengthDelimited):
            displayName = try reader.readString()
        case (5, .lengthDelimited):
            avatarUrl = try reader.readString()
        case (6, .varint):
            role = Role(rawValue: try reader.readInt32()) ?? .roleUnspecified
        case (7, .varint):
            status = Status(rawValue: try reader.readInt32()) ?? .statusUnspecified
        case (8, .lengthDelimited):
            secondaryEmail = try reader.readString()
        case (9, .varint):
            theme = Theme(rawValue: try reader.readInt32()) ?? .themeUnspecified
        case (10, .varint):
            colorScheme = ColorScheme(rawValue: try reader.readInt32()) ?? .colorSchemeUnspecified
        case (11, .varint):
            isHiddenInHistory = try reader.readBool()
        case (12, .varint):
            unitSystem = UnitSystem(rawValue: try reader.readInt32()) ?? .unitSystemUnspecified
        case (13, .varint):
            mapOption = MapOption(rawValue: try reader.readInt32()) ?? .mapOptionUnspecified
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetUserRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateUserRequest: ProtoBinaryMessage {
    public var userStorage: User? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var user: User {
        get { userStorage ?? User() }
        set { userStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }
    public var hasUser: Bool { userStorage != nil }
    public var hasUpdateMask: Bool { updateMaskStorage != nil }

    public init() {}

    public init(user: User, updateMask: ProtoFieldMask? = nil) {
        self.userStorage = user
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: userStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            userStorage = try reader.readMessage()
        case (2, .lengthDelimited):
            updateMaskStorage = try reader.readMessage()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListUsersRequest: ProtoBinaryMessage {
    public var fieldMaskStorage: ProtoFieldMask? = nil

    public init() {}
    public static func getDefaultInstance() -> ListUsersRequest { ListUsersRequest() }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: fieldMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            fieldMaskStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListUsersResponse: ProtoBinaryMessage {
    public var users: [User] = []
    public var usersList: [User] { users }
    public var usersCount: Int { users.count }

    public init() {}
    public init(users: [User]) { self.users = users }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: users)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            users.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteUserRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - regions.proto

public struct Region: ProtoBinaryMessage, Identifiable {
    public enum State: Int32, CaseIterable, Sendable, Hashable {
        case stateUnspecified = 0
        case `default` = 1
        case historyVisible = 2
        case hidden = 3
        case historyVisibleNoMap = 4

        public static let STATE_UNSPECIFIED: State = .stateUnspecified
        public static let DEFAULT: State = .default
        public static let HISTORY_VISIBLE: State = .historyVisible
        public static let HIDDEN: State = .hidden
        public static let HISTORY_VISIBLE_NO_MAP: State = .historyVisibleNoMap

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> State? { State(rawValue: rawNumber) }
    }

    public var name: String = ""
    public var id: String = ""
    public var displayName: String = ""
    public var parentRegion: String = ""
    public var state: State = .stateUnspecified

    public init() {}

    public init(
        name: String = "",
        id: String = "",
        displayName: String = "",
        parentRegion: String = "",
        state: State = .stateUnspecified
    ) {
        self.name = name
        self.id = id
        self.displayName = displayName
        self.parentRegion = parentRegion
        self.state = state
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: id)
        writer.writeStringField(fieldNumber: 3, value: displayName)
        writer.writeStringField(fieldNumber: 4, value: parentRegion)
        writer.writeEnumField(fieldNumber: 5, rawNumber: state.rawValue)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            name = try reader.readString()
        case (2, .lengthDelimited):
            id = try reader.readString()
        case (3, .lengthDelimited):
            displayName = try reader.readString()
        case (4, .lengthDelimited):
            parentRegion = try reader.readString()
        case (5, .varint):
            state = State(rawValue: try reader.readInt32()) ?? .stateUnspecified
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListRegionsRequest: ProtoBinaryMessage {
    public init() {}
    public static func getDefaultInstance() -> ListRegionsRequest { ListRegionsRequest() }
    public func encodeToProtoWire(writer: inout ProtoWireWriter) {}
    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        try reader.skipField(wireType: wireType)
    }
}

public struct ListRegionsResponse: ProtoBinaryMessage {
    public var regions: [Region] = []
    public var regionsList: [Region] { regions }
    public var regionsCount: Int { regions.count }

    public init() {}
    public init(regions: [Region]) { self.regions = regions }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: regions)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            regions.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetRegionRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateRegionRequest: ProtoBinaryMessage {
    public var regionStorage: Region? = nil
    public var region: Region {
        get { regionStorage ?? Region() }
        set { regionStorage = newValue }
    }

    public init() {}
    public init(region: Region) { self.regionStorage = region }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: regionStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            regionStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateRegionRequest: ProtoBinaryMessage {
    public var regionStorage: Region? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var region: Region {
        get { regionStorage ?? Region() }
        set { regionStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(region: Region, updateMask: ProtoFieldMask? = nil) {
        self.regionStorage = region
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: regionStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            regionStorage = try reader.readMessage()
        case (2, .lengthDelimited):
            updateMaskStorage = try reader.readMessage()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteRegionRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - canyons.proto

public struct Canyon: ProtoBinaryMessage, Identifiable {
    public struct TotalTime: ProtoBinaryMessage {
        public var totalTimeStorage: ProtoDateTime? = nil
        public var minTimeStorage: ProtoDateTime? = nil
        public var maxTimeStorage: ProtoDateTime? = nil

        public var totalTime: ProtoDateTime {
            get { totalTimeStorage ?? ProtoDateTime() }
            set { totalTimeStorage = newValue }
        }
        public var minTime: ProtoDateTime {
            get { minTimeStorage ?? ProtoDateTime() }
            set { minTimeStorage = newValue }
        }
        public var maxTime: ProtoDateTime {
            get { maxTimeStorage ?? ProtoDateTime() }
            set { maxTimeStorage = newValue }
        }
        public var hasTotalTime: Bool { totalTimeStorage != nil }
        public var hasMinTime: Bool { minTimeStorage != nil }
        public var hasMaxTime: Bool { maxTimeStorage != nil }

        public init() {}

        public init(
            totalTime: ProtoDateTime? = nil,
            minTime: ProtoDateTime? = nil,
            maxTime: ProtoDateTime? = nil
        ) {
            self.totalTimeStorage = totalTime
            self.minTimeStorage = minTime
            self.maxTimeStorage = maxTime
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeOptionalMessageField(fieldNumber: 1, message: totalTimeStorage)
            writer.writeOptionalMessageField(fieldNumber: 2, message: minTimeStorage)
            writer.writeOptionalMessageField(fieldNumber: 3, message: maxTimeStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited):
                totalTimeStorage = try reader.readMessage()
            case (2, .lengthDelimited):
                minTimeStorage = try reader.readMessage()
            case (3, .lengthDelimited):
                maxTimeStorage = try reader.readMessage()
            default:
                try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct RappelPitch: ProtoBinaryMessage, Identifiable {
        public var id: String = ""
        public var name: String = ""
        public var length: String = ""
        public var anchor: String = ""
        public var hasPool: Bool = false
        public var poolsCount: Int32 = 0
        public var description: String = ""
        public var section: String = ""
        public var isAlternative: Bool = false
        public var altOf: String = ""
        public var isStaged: Bool = false
        public var stagedNote: String = ""
        public var escapeExit: String = ""

        public init() {}

        public init(
            id: String = "",
            name: String = "",
            length: String = "",
            anchor: String = "",
            hasPool: Bool = false,
            poolsCount: Int32 = 0,
            description: String = "",
            section: String = "",
            isAlternative: Bool = false,
            altOf: String = "",
            isStaged: Bool = false,
            stagedNote: String = "",
            escapeExit: String = ""
        ) {
            self.id = id
            self.name = name
            self.length = length
            self.anchor = anchor
            self.hasPool = hasPool
            self.poolsCount = poolsCount
            self.description = description
            self.section = section
            self.isAlternative = isAlternative
            self.altOf = altOf
            self.isStaged = isStaged
            self.stagedNote = stagedNote
            self.escapeExit = escapeExit
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: id)
            writer.writeStringField(fieldNumber: 2, value: name)
            writer.writeStringField(fieldNumber: 3, value: length)
            writer.writeStringField(fieldNumber: 4, value: anchor)
            writer.writeBoolField(fieldNumber: 5, value: hasPool)
            writer.writeInt32Field(fieldNumber: 6, value: poolsCount)
            writer.writeStringField(fieldNumber: 7, value: description)
            writer.writeStringField(fieldNumber: 8, value: section)
            writer.writeBoolField(fieldNumber: 9, value: isAlternative)
            writer.writeStringField(fieldNumber: 10, value: altOf)
            writer.writeBoolField(fieldNumber: 11, value: isStaged)
            writer.writeStringField(fieldNumber: 12, value: stagedNote)
            writer.writeStringField(fieldNumber: 13, value: escapeExit)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): id = try reader.readString()
            case (2, .lengthDelimited): name = try reader.readString()
            case (3, .lengthDelimited): length = try reader.readString()
            case (4, .lengthDelimited): anchor = try reader.readString()
            case (5, .varint): hasPool = try reader.readBool()
            case (6, .varint): poolsCount = try reader.readInt32()
            case (7, .lengthDelimited): description = try reader.readString()
            case (8, .lengthDelimited): section = try reader.readString()
            case (9, .varint): isAlternative = try reader.readBool()
            case (10, .lengthDelimited): altOf = try reader.readString()
            case (11, .varint): isStaged = try reader.readBool()
            case (12, .lengthDelimited): stagedNote = try reader.readString()
            case (13, .lengthDelimited): escapeExit = try reader.readString()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct CanyonLink: ProtoBinaryMessage {
        public var title: String = ""
        public var url: String = ""

        public init() {}
        public init(title: String = "", url: String = "") {
            self.title = title
            self.url = url
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: title)
            writer.writeStringField(fieldNumber: 2, value: url)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): title = try reader.readString()
            case (2, .lengthDelimited): url = try reader.readString()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct QualityRating: ProtoBinaryMessage {
        public var source: String = ""
        public var value: String = ""

        public init() {}
        public init(source: String = "", value: String = "") {
            self.source = source
            self.value = value
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: source)
            writer.writeStringField(fieldNumber: 2, value: value)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): source = try reader.readString()
            case (2, .lengthDelimited): value = try reader.readString()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct Descent: ProtoBinaryMessage {
        public var dateStorage: ProtoDate? = nil
        public var numberOfPeople: Int32 = 0
        public var photosLink: String = ""

        public var date: ProtoDate {
            get { dateStorage ?? ProtoDate() }
            set { dateStorage = newValue }
        }
        public var hasDate: Bool { dateStorage != nil }

        public init() {}
        public init(date: ProtoDate? = nil, numberOfPeople: Int32 = 0, photosLink: String = "") {
            self.dateStorage = date
            self.numberOfPeople = numberOfPeople
            self.photosLink = photosLink
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeOptionalMessageField(fieldNumber: 1, message: dateStorage)
            writer.writeInt32Field(fieldNumber: 2, value: numberOfPeople)
            writer.writeStringField(fieldNumber: 3, value: photosLink)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): dateStorage = try reader.readMessage()
            case (2, .varint): numberOfPeople = try reader.readInt32()
            case (3, .lengthDelimited): photosLink = try reader.readString()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var name: String = ""
    public var id: String = ""
    public var regionId: String = ""
    public var displayName: String = ""
    public var description: String = ""
    public var technicalRating: String = ""
    public var waterRating: String = ""
    public var timeRating: String = ""
    public var riskRating: String = ""
    public var rappelsCount: Int32 = 0
    public var maxRappelMeters: Double = 0.0
    public var totalTimeStorage: TotalTime? = nil
    public var season: String = ""
    public var distanceKm: Double = 0.0
    public var elevationDropMeters: Double = 0.0
    public var elevationGainMeters: Double = 0.0
    public var overview: String = ""
    public var approach: String = ""
    public var descent: String = ""
    public var exit: String = ""
    public var redTape: String = ""
    public var permits: String = ""
    public var shuttle: String = ""
    public var vehicle: String = ""
    public var gpxTrackIds: [String] = []
    public var pitches: [RappelPitch] = []
    public var links: [CanyonLink] = []
    public var qualityRatings: [QualityRating] = []
    public var descents: [Descent] = []

    public var totalTime: TotalTime {
        get { totalTimeStorage ?? TotalTime() }
        set { totalTimeStorage = newValue }
    }
    public var hasTotalTime: Bool { totalTimeStorage != nil }
    public var gpxTrackIdsList: [String] { gpxTrackIds }
    public var gpxTrackIdsCount: Int { gpxTrackIds.count }
    public var pitchesList: [RappelPitch] { pitches }
    public var pitchesCount: Int { pitches.count }
    public var linksList: [CanyonLink] { links }
    public var linksCount: Int { links.count }
    public var qualityRatingsList: [QualityRating] { qualityRatings }
    public var qualityRatingsCount: Int { qualityRatings.count }
    public var descentsList: [Descent] { descents }
    public var descentsCount: Int { descents.count }

    public init() {}

    public init(
        name: String = "",
        id: String = "",
        regionId: String = "",
        displayName: String = "",
        description: String = "",
        technicalRating: String = "",
        waterRating: String = "",
        timeRating: String = "",
        riskRating: String = "",
        rappelsCount: Int32 = 0,
        maxRappelMeters: Double = 0.0,
        totalTime: TotalTime? = nil,
        season: String = "",
        distanceKm: Double = 0.0,
        elevationDropMeters: Double = 0.0,
        elevationGainMeters: Double = 0.0,
        overview: String = "",
        approach: String = "",
        descent: String = "",
        exit: String = "",
        redTape: String = "",
        permits: String = "",
        shuttle: String = "",
        vehicle: String = "",
        gpxTrackIds: [String] = [],
        pitches: [RappelPitch] = [],
        links: [CanyonLink] = [],
        qualityRatings: [QualityRating] = [],
        descents: [Descent] = []
    ) {
        self.name = name
        self.id = id
        self.regionId = regionId
        self.displayName = displayName
        self.description = description
        self.technicalRating = technicalRating
        self.waterRating = waterRating
        self.timeRating = timeRating
        self.riskRating = riskRating
        self.rappelsCount = rappelsCount
        self.maxRappelMeters = maxRappelMeters
        self.totalTimeStorage = totalTime
        self.season = season
        self.distanceKm = distanceKm
        self.elevationDropMeters = elevationDropMeters
        self.elevationGainMeters = elevationGainMeters
        self.overview = overview
        self.approach = approach
        self.descent = descent
        self.exit = exit
        self.redTape = redTape
        self.permits = permits
        self.shuttle = shuttle
        self.vehicle = vehicle
        self.gpxTrackIds = gpxTrackIds
        self.pitches = pitches
        self.links = links
        self.qualityRatings = qualityRatings
        self.descents = descents
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: id)
        writer.writeStringField(fieldNumber: 3, value: regionId)
        writer.writeStringField(fieldNumber: 4, value: displayName)
        writer.writeStringField(fieldNumber: 6, value: description)
        writer.writeStringField(fieldNumber: 7, value: technicalRating)
        writer.writeStringField(fieldNumber: 8, value: waterRating)
        writer.writeStringField(fieldNumber: 9, value: timeRating)
        writer.writeStringField(fieldNumber: 10, value: riskRating)
        writer.writeInt32Field(fieldNumber: 12, value: rappelsCount)
        writer.writeDoubleField(fieldNumber: 13, value: maxRappelMeters)
        writer.writeOptionalMessageField(fieldNumber: 14, message: totalTimeStorage)
        writer.writeStringField(fieldNumber: 15, value: season)
        writer.writeDoubleField(fieldNumber: 17, value: distanceKm)
        writer.writeDoubleField(fieldNumber: 18, value: elevationDropMeters)
        writer.writeDoubleField(fieldNumber: 19, value: elevationGainMeters)
        writer.writeStringField(fieldNumber: 20, value: overview)
        writer.writeStringField(fieldNumber: 21, value: approach)
        writer.writeStringField(fieldNumber: 22, value: descent)
        writer.writeStringField(fieldNumber: 23, value: exit)
        writer.writeStringField(fieldNumber: 24, value: redTape)
        writer.writeStringField(fieldNumber: 25, value: permits)
        writer.writeStringField(fieldNumber: 26, value: shuttle)
        writer.writeStringField(fieldNumber: 27, value: vehicle)
        writer.writeRepeatedStringField(fieldNumber: 32, values: gpxTrackIds)
        writer.writeRepeatedMessageField(fieldNumber: 33, messages: pitches)
        writer.writeRepeatedMessageField(fieldNumber: 34, messages: links)
        writer.writeRepeatedMessageField(fieldNumber: 35, messages: qualityRatings)
        writer.writeRepeatedMessageField(fieldNumber: 36, messages: descents)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): id = try reader.readString()
        case (3, .lengthDelimited): regionId = try reader.readString()
        case (4, .lengthDelimited): displayName = try reader.readString()
        case (6, .lengthDelimited): description = try reader.readString()
        case (7, .lengthDelimited): technicalRating = try reader.readString()
        case (8, .lengthDelimited): waterRating = try reader.readString()
        case (9, .lengthDelimited): timeRating = try reader.readString()
        case (10, .lengthDelimited): riskRating = try reader.readString()
        case (12, .varint): rappelsCount = try reader.readInt32()
        case (13, _): maxRappelMeters = try reader.readDouble(wireType: wireType)
        case (14, .lengthDelimited): totalTimeStorage = try reader.readMessage()
        case (15, .lengthDelimited): season = try reader.readString()
        case (17, _): distanceKm = try reader.readDouble(wireType: wireType)
        case (18, _): elevationDropMeters = try reader.readDouble(wireType: wireType)
        case (19, _): elevationGainMeters = try reader.readDouble(wireType: wireType)
        case (20, .lengthDelimited): overview = try reader.readString()
        case (21, .lengthDelimited): approach = try reader.readString()
        case (22, .lengthDelimited): descent = try reader.readString()
        case (23, .lengthDelimited): exit = try reader.readString()
        case (24, .lengthDelimited): redTape = try reader.readString()
        case (25, .lengthDelimited): permits = try reader.readString()
        case (26, .lengthDelimited): shuttle = try reader.readString()
        case (27, .lengthDelimited): vehicle = try reader.readString()
        case (32, .lengthDelimited): gpxTrackIds.append(try reader.readString())
        case (33, .lengthDelimited): pitches.append(try reader.readMessage())
        case (34, .lengthDelimited): links.append(try reader.readMessage())
        case (35, .lengthDelimited): qualityRatings.append(try reader.readMessage())
        case (36, .lengthDelimited): descents.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListCanyonsRequest: ProtoBinaryMessage {
    public var parent: String = ""
    public var pageSize: Int32 = 0
    public var pageToken: String = ""
    public var region: String = ""
    public var readMaskStorage: ProtoFieldMask? = nil

    public init() {}
    public init(pageSize: Int32 = 1000) { self.pageSize = pageSize }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: parent)
        writer.writeInt32Field(fieldNumber: 2, value: pageSize)
        writer.writeStringField(fieldNumber: 3, value: pageToken)
        writer.writeStringField(fieldNumber: 4, value: region)
        writer.writeOptionalMessageField(fieldNumber: 5, message: readMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): parent = try reader.readString()
        case (2, .varint): pageSize = try reader.readInt32()
        case (3, .lengthDelimited): pageToken = try reader.readString()
        case (4, .lengthDelimited): region = try reader.readString()
        case (5, .lengthDelimited): readMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListCanyonsResponse: ProtoBinaryMessage {
    public var canyons: [Canyon] = []
    public var nextPageToken: String = ""
    public var totalSize: Int32 = 0

    public var canyonsList: [Canyon] { canyons }
    public var canyonsCount: Int { canyons.count }

    public init() {}
    public init(canyons: [Canyon], totalSize: Int32 = 0) {
        self.canyons = canyons
        self.totalSize = totalSize
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: canyons)
        writer.writeStringField(fieldNumber: 2, value: nextPageToken)
        writer.writeInt32Field(fieldNumber: 3, value: totalSize)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): canyons.append(try reader.readMessage())
        case (2, .lengthDelimited): nextPageToken = try reader.readString()
        case (3, .varint): totalSize = try reader.readInt32()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetCanyonRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateCanyonRequest: ProtoBinaryMessage {
    public var parent: String = ""
    public var canyonStorage: Canyon? = nil

    public var canyon: Canyon {
        get { canyonStorage ?? Canyon() }
        set { canyonStorage = newValue }
    }

    public init() {}
    public init(parent: String = "", canyon: Canyon) {
        self.parent = parent
        self.canyonStorage = canyon
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: parent)
        writer.writeOptionalMessageField(fieldNumber: 2, message: canyonStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): parent = try reader.readString()
        case (2, .lengthDelimited): canyonStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateCanyonRequest: ProtoBinaryMessage {
    public var canyonStorage: Canyon? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var canyon: Canyon {
        get { canyonStorage ?? Canyon() }
        set { canyonStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(canyon: Canyon, updateMask: ProtoFieldMask? = nil) {
        self.canyonStorage = canyon
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: canyonStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): canyonStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteCanyonRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct BatchGetCanyonsRequest: ProtoBinaryMessage {
    public var names: [String] = []
    public var namesList: [String] { names }
    public var namesCount: Int { names.count }

    public init() {}
    public init(names: [String]) { self.names = names }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedStringField(fieldNumber: 1, values: names)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            names.append(try reader.readString())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct BatchGetCanyonsResponse: ProtoBinaryMessage {
    public var canyons: [Canyon] = []
    public var canyonsList: [Canyon] { canyons }
    public var canyonsCount: Int { canyons.count }

    public init() {}
    public init(canyons: [Canyon]) { self.canyons = canyons }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: canyons)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            canyons.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ParseCanyonRequest: ProtoBinaryMessage {
    public var urls: [String] = []
    public var parent: String = ""

    public var urlsList: [String] { urls }

    public init() {}
    public init(urls: [String], parent: String = "") {
        self.urls = urls
        self.parent = parent
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedStringField(fieldNumber: 1, values: urls)
        writer.writeStringField(fieldNumber: 2, value: parent)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): urls.append(try reader.readString())
        case (2, .lengthDelimited): parent = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ParseCanyonResponse: ProtoBinaryMessage {
    public var canyonStorage: Canyon? = nil
    public var extractedMetadata: [String: String] = [:]
    public var externalLinks: [Canyon.CanyonLink] = []
    public var gpxContent: String = ""

    public var canyon: Canyon {
        get { canyonStorage ?? Canyon() }
        set { canyonStorage = newValue }
    }
    public var hasCanyon: Bool { canyonStorage != nil }
    public var extractedMetadataMap: [String: String] { extractedMetadata }
    public var externalLinksList: [Canyon.CanyonLink] { externalLinks }

    public init() {}

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: canyonStorage)
        writer.writeStringToStringMapField(fieldNumber: 2, mapEntries: extractedMetadata)
        writer.writeRepeatedMessageField(fieldNumber: 3, messages: externalLinks)
        writer.writeStringField(fieldNumber: 4, value: gpxContent)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            canyonStorage = try reader.readMessage()
        case (2, .lengthDelimited):
            let mapEntry = try reader.readStringToStringMapEntry()
            extractedMetadata[mapEntry.key] = mapEntry.value
        case (3, .lengthDelimited):
            externalLinks.append(try reader.readMessage())
        case (4, .lengthDelimited):
            gpxContent = try reader.readString()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - gpx.proto

public struct TrackStats: ProtoBinaryMessage {
    public var totalDistanceMeters: Double = 0.0
    public var elevationGainMeters: Double = 0.0
    public var elevationLossMeters: Double = 0.0
    public var minElevationMeters: Double = 0.0
    public var maxElevationMeters: Double = 0.0

    public init() {}

    public init(
        totalDistanceMeters: Double = 0.0,
        elevationGainMeters: Double = 0.0,
        elevationLossMeters: Double = 0.0,
        minElevationMeters: Double = 0.0,
        maxElevationMeters: Double = 0.0
    ) {
        self.totalDistanceMeters = totalDistanceMeters
        self.elevationGainMeters = elevationGainMeters
        self.elevationLossMeters = elevationLossMeters
        self.minElevationMeters = minElevationMeters
        self.maxElevationMeters = maxElevationMeters
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeDoubleField(fieldNumber: 1, value: totalDistanceMeters)
        writer.writeDoubleField(fieldNumber: 2, value: elevationGainMeters)
        writer.writeDoubleField(fieldNumber: 3, value: elevationLossMeters)
        writer.writeDoubleField(fieldNumber: 4, value: minElevationMeters)
        writer.writeDoubleField(fieldNumber: 5, value: maxElevationMeters)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch fieldNumber {
        case 1: totalDistanceMeters = try reader.readDouble(wireType: wireType)
        case 2: elevationGainMeters = try reader.readDouble(wireType: wireType)
        case 3: elevationLossMeters = try reader.readDouble(wireType: wireType)
        case 4: minElevationMeters = try reader.readDouble(wireType: wireType)
        case 5: maxElevationMeters = try reader.readDouble(wireType: wireType)
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GeoBounds: ProtoBinaryMessage {
    public var southWestStorage: ProtoLatLng? = nil
    public var northEastStorage: ProtoLatLng? = nil

    public var southWest: ProtoLatLng {
        get { southWestStorage ?? ProtoLatLng() }
        set { southWestStorage = newValue }
    }
    public var northEast: ProtoLatLng {
        get { northEastStorage ?? ProtoLatLng() }
        set { northEastStorage = newValue }
    }
    public var hasSouthWest: Bool { southWestStorage != nil }
    public var hasNorthEast: Bool { northEastStorage != nil }

    public init() {}

    public init(southWest: ProtoLatLng? = nil, northEast: ProtoLatLng? = nil) {
        self.southWestStorage = southWest
        self.northEastStorage = northEast
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: southWestStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: northEastStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): southWestStorage = try reader.readMessage()
        case (2, .lengthDelimited): northEastStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct Waypoint: ProtoBinaryMessage, Identifiable {
    public enum WaypointType: Int32, CaseIterable, Sendable, Hashable {
        case typeUnspecified = 0
        case trailhead = 1
        case rappel = 2
        case water = 3
        case junction = 4
        case obstacle = 5
        case exitPoint = 6
        case vehicleDrop = 7
        case danger = 8
        case camp = 9
        case other = 10
        case canyonStart = 11

        public static let TYPE_UNSPECIFIED: WaypointType = .typeUnspecified
        public static let TRAILHEAD: WaypointType = .trailhead
        public static let RAPPEL: WaypointType = .rappel
        public static let WATER: WaypointType = .water
        public static let JUNCTION: WaypointType = .junction
        public static let OBSTACLE: WaypointType = .obstacle
        public static let EXIT_POINT: WaypointType = .exitPoint
        public static let VEHICLE_DROP: WaypointType = .vehicleDrop
        public static let DANGER: WaypointType = .danger
        public static let CAMP: WaypointType = .camp
        public static let OTHER: WaypointType = .other
        public static let CANYON_START: WaypointType = .canyonStart

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> WaypointType? { WaypointType(rawValue: rawNumber) }
    }
    public typealias `Type` = WaypointType

    public var pointStorage: GeoPoint? = nil
    public var name: String = ""
    public var description: String = ""
    public var type: WaypointType = .typeUnspecified
    public var id: String = ""

    public var point: GeoPoint {
        get { pointStorage ?? GeoPoint() }
        set { pointStorage = newValue }
    }
    public var hasPoint: Bool { pointStorage != nil }

    public init() {}

    public init(
        point: GeoPoint? = nil,
        name: String = "",
        description: String = "",
        type: WaypointType = .typeUnspecified,
        id: String = ""
    ) {
        self.pointStorage = point
        self.name = name
        self.description = description
        self.type = type
        self.id = id
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: pointStorage)
        writer.writeStringField(fieldNumber: 2, value: name)
        writer.writeStringField(fieldNumber: 3, value: description)
        writer.writeEnumField(fieldNumber: 4, rawNumber: type.rawValue)
        writer.writeStringField(fieldNumber: 5, value: id)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): pointStorage = try reader.readMessage()
        case (2, .lengthDelimited): name = try reader.readString()
        case (3, .lengthDelimited): description = try reader.readString()
        case (4, .varint): type = WaypointType(rawValue: try reader.readInt32()) ?? .typeUnspecified
        case (5, .lengthDelimited): id = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct Segment: ProtoBinaryMessage, Identifiable {
    public enum SegmentType: Int32, CaseIterable, Sendable, Hashable {
        case typeUnspecified = 0
        case approach = 1
        case descent = 2
        case exit = 3
        case shuttle = 4
        case escape = 5
        case alternative = 6
        case other = 7

        public static let TYPE_UNSPECIFIED: SegmentType = .typeUnspecified
        public static let APPROACH: SegmentType = .approach
        public static let DESCENT: SegmentType = .descent
        public static let EXIT: SegmentType = .exit
        public static let SHUTTLE: SegmentType = .shuttle
        public static let ESCAPE: SegmentType = .escape
        public static let ALTERNATIVE: SegmentType = .alternative
        public static let OTHER: SegmentType = .other

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> SegmentType? { SegmentType(rawValue: rawNumber) }
    }
    public typealias `Type` = SegmentType

    public var name: String = ""
    public var description: String = ""
    public var type: SegmentType = .typeUnspecified
    public var customType: String = ""
    public var displayColor: String = ""
    public var points: [GeoPoint] = []
    public var statsStorage: TrackStats? = nil
    public var waypoints: [Waypoint] = []
    public var id: String = ""

    public var pointsList: [GeoPoint] { points }
    public var pointsCount: Int { points.count }
    public var waypointsList: [Waypoint] { waypoints }
    public var waypointsCount: Int { waypoints.count }
    public var stats: TrackStats {
        get { statsStorage ?? TrackStats() }
        set { statsStorage = newValue }
    }
    public var hasStats: Bool { statsStorage != nil }

    public init() {}

    public init(
        name: String = "",
        description: String = "",
        type: SegmentType = .typeUnspecified,
        customType: String = "",
        displayColor: String = "",
        points: [GeoPoint] = [],
        stats: TrackStats? = nil,
        waypoints: [Waypoint] = [],
        id: String = ""
    ) {
        self.name = name
        self.description = description
        self.type = type
        self.customType = customType
        self.displayColor = displayColor
        self.points = points
        self.statsStorage = stats
        self.waypoints = waypoints
        self.id = id
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: description)
        writer.writeEnumField(fieldNumber: 3, rawNumber: type.rawValue)
        writer.writeStringField(fieldNumber: 4, value: customType)
        writer.writeStringField(fieldNumber: 5, value: displayColor)
        writer.writeRepeatedMessageField(fieldNumber: 6, messages: points)
        writer.writeOptionalMessageField(fieldNumber: 7, message: statsStorage)
        writer.writeRepeatedMessageField(fieldNumber: 8, messages: waypoints)
        writer.writeStringField(fieldNumber: 9, value: id)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): description = try reader.readString()
        case (3, .varint): type = SegmentType(rawValue: try reader.readInt32()) ?? .typeUnspecified
        case (4, .lengthDelimited): customType = try reader.readString()
        case (5, .lengthDelimited): displayColor = try reader.readString()
        case (6, .lengthDelimited): points.append(try reader.readMessage())
        case (7, .lengthDelimited): statsStorage = try reader.readMessage()
        case (8, .lengthDelimited): waypoints.append(try reader.readMessage())
        case (9, .lengthDelimited): id = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GpxTrack: ProtoBinaryMessage, Identifiable {
    public var id: String { name.isEmpty ? displayName : name }

    public var name: String = ""
    public var displayName: String = ""
    public var gpxContent: String = ""
    public var isDefault: Bool = false
    public var description: String = ""
    public var author: String = ""
    public var waypoints: [Waypoint] = []
    public var segments: [Segment] = []
    public var summaryStatsStorage: TrackStats? = nil
    public var boundsStorage: GeoBounds? = nil
    public var ownerUserId: String = ""
    public var isPrivate: Bool = false
    public var recordedAtEpochMs: Int64 = 0

    public var waypointsList: [Waypoint] { waypoints }
    public var waypointsCount: Int { waypoints.count }
    public var segmentsList: [Segment] { segments }
    public var segmentsCount: Int { segments.count }
    public var summaryStats: TrackStats {
        get { summaryStatsStorage ?? TrackStats() }
        set { summaryStatsStorage = newValue }
    }
    public var hasSummaryStats: Bool { summaryStatsStorage != nil }
    public var bounds: GeoBounds {
        get { boundsStorage ?? GeoBounds() }
        set { boundsStorage = newValue }
    }
    public var hasBounds: Bool { boundsStorage != nil }

    public init() {}

    public init(
        name: String = "",
        displayName: String = "",
        gpxContent: String = "",
        isDefault: Bool = false,
        description: String = "",
        author: String = "",
        waypoints: [Waypoint] = [],
        segments: [Segment] = [],
        summaryStats: TrackStats? = nil,
        bounds: GeoBounds? = nil,
        ownerUserId: String = "",
        isPrivate: Bool = false,
        recordedAtEpochMs: Int64 = 0
    ) {
        self.name = name
        self.displayName = displayName
        self.gpxContent = gpxContent
        self.isDefault = isDefault
        self.description = description
        self.author = author
        self.waypoints = waypoints
        self.segments = segments
        self.summaryStatsStorage = summaryStats
        self.boundsStorage = bounds
        self.ownerUserId = ownerUserId
        self.isPrivate = isPrivate
        self.recordedAtEpochMs = recordedAtEpochMs
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: displayName)
        writer.writeStringField(fieldNumber: 3, value: gpxContent)
        writer.writeBoolField(fieldNumber: 4, value: isDefault)
        writer.writeStringField(fieldNumber: 6, value: description)
        writer.writeStringField(fieldNumber: 7, value: author)
        writer.writeRepeatedMessageField(fieldNumber: 8, messages: waypoints)
        writer.writeRepeatedMessageField(fieldNumber: 9, messages: segments)
        writer.writeOptionalMessageField(fieldNumber: 10, message: summaryStatsStorage)
        writer.writeOptionalMessageField(fieldNumber: 11, message: boundsStorage)
        writer.writeStringField(fieldNumber: 12, value: ownerUserId)
        writer.writeBoolField(fieldNumber: 13, value: isPrivate)
        writer.writeInt64Field(fieldNumber: 14, value: recordedAtEpochMs)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): displayName = try reader.readString()
        case (3, .lengthDelimited): gpxContent = try reader.readString()
        case (4, .varint): isDefault = try reader.readBool()
        case (6, .lengthDelimited): description = try reader.readString()
        case (7, .lengthDelimited): author = try reader.readString()
        case (8, .lengthDelimited): waypoints.append(try reader.readMessage())
        case (9, .lengthDelimited): segments.append(try reader.readMessage())
        case (10, .lengthDelimited): summaryStatsStorage = try reader.readMessage()
        case (11, .lengthDelimited): boundsStorage = try reader.readMessage()
        case (12, .lengthDelimited): ownerUserId = try reader.readString()
        case (13, .varint): isPrivate = try reader.readBool()
        case (14, .varint): recordedAtEpochMs = try reader.readInt64()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct QueryGpxTracksRequest: ProtoBinaryMessage {
    public var canyon: String = ""
    public var region: String = ""
    public var name: String = ""

    public init() {}
    public init(canyon: String = "", region: String = "", name: String = "") {
        self.canyon = canyon
        self.region = region
        self.name = name
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        if !canyon.isEmpty {
            writer.writeStringField(fieldNumber: 1, value: canyon)
        } else if !region.isEmpty {
            writer.writeStringField(fieldNumber: 2, value: region)
        } else if !name.isEmpty {
            writer.writeStringField(fieldNumber: 3, value: name)
        }
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            canyon = try reader.readString()
            region = ""
            name = ""
        case (2, .lengthDelimited):
            region = try reader.readString()
            canyon = ""
            name = ""
        case (3, .lengthDelimited):
            name = try reader.readString()
            canyon = ""
            region = ""
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct QueryGpxTracksResponse: ProtoBinaryMessage {
    public var tracks: [GpxTrack] = []
    public var tracksList: [GpxTrack] { tracks }
    public var tracksCount: Int { tracks.count }

    public init() {}
    public init(tracks: [GpxTrack]) { self.tracks = tracks }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: tracks)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            tracks.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UploadGpxTrackRequest: ProtoBinaryMessage {
    public enum Format: Int32, CaseIterable, Sendable, Hashable {
        case formatUnspecified = 0
        case gpx = 1
        case kml = 2
        case kmz = 3

        public static let FORMAT_UNSPECIFIED: Format = .formatUnspecified
        public static let GPX: Format = .gpx
        public static let KML: Format = .kml
        public static let KMZ: Format = .kmz

        public var number: Int32 { rawValue }
    }

    public var parent: String = ""
    public var fileContent: Data = Data()
    public var fileName: String = ""
    public var format: Format = .formatUnspecified
    public var displayName: String = ""
    public var description: String = ""
    public var author: String = ""
    public var isDefault: Bool = false
    public var isPrivate: Bool = false
    public var recordedAtEpochMs: Int64 = 0

    public init() {}

    public init(
        parent: String = "",
        fileContent: Data = Data(),
        fileName: String = "",
        format: Format = .gpx,
        displayName: String = "",
        description: String = "",
        author: String = "",
        isDefault: Bool = false,
        isPrivate: Bool = false,
        recordedAtEpochMs: Int64 = 0
    ) {
        self.parent = parent
        self.fileContent = fileContent
        self.fileName = fileName
        self.format = format
        self.displayName = displayName
        self.description = description
        self.author = author
        self.isDefault = isDefault
        self.isPrivate = isPrivate
        self.recordedAtEpochMs = recordedAtEpochMs
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: parent)
        writer.writeBytesField(fieldNumber: 2, value: fileContent)
        writer.writeStringField(fieldNumber: 3, value: fileName)
        writer.writeEnumField(fieldNumber: 4, rawNumber: format.rawValue)
        writer.writeStringField(fieldNumber: 5, value: displayName)
        writer.writeStringField(fieldNumber: 6, value: description)
        writer.writeStringField(fieldNumber: 7, value: author)
        writer.writeBoolField(fieldNumber: 8, value: isDefault)
        writer.writeBoolField(fieldNumber: 10, value: isPrivate)
        writer.writeInt64Field(fieldNumber: 11, value: recordedAtEpochMs)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): parent = try reader.readString()
        case (2, .lengthDelimited): fileContent = try reader.readBytes()
        case (3, .lengthDelimited): fileName = try reader.readString()
        case (4, .varint): format = Format(rawValue: try reader.readInt32()) ?? .formatUnspecified
        case (5, .lengthDelimited): displayName = try reader.readString()
        case (6, .lengthDelimited): description = try reader.readString()
        case (7, .lengthDelimited): author = try reader.readString()
        case (8, .varint): isDefault = try reader.readBool()
        case (10, .varint): isPrivate = try reader.readBool()
        case (11, .varint): recordedAtEpochMs = try reader.readInt64()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DownloadGpxTrackRequest: ProtoBinaryMessage {
    public enum Format: Int32, CaseIterable, Sendable, Hashable {
        case formatUnspecified = 0
        case gpx = 1
        case kml = 2
        case kmz = 3

        public static let FORMAT_UNSPECIFIED: Format = .formatUnspecified
        public static let GPX: Format = .gpx
        public static let KML: Format = .kml
        public static let KMZ: Format = .kmz
    }

    public var name: String = ""
    public var format: Format = .formatUnspecified

    public init() {}
    public init(name: String, format: Format = .gpx) {
        self.name = name
        self.format = format
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeEnumField(fieldNumber: 2, rawNumber: format.rawValue)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .varint): format = Format(rawValue: try reader.readInt32()) ?? .formatUnspecified
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DownloadGpxTrackResponse: ProtoBinaryMessage {
    public var fileName: String = ""
    public var mimeType: String = ""
    public var fileContent: Data = Data()

    public init() {}

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: fileName)
        writer.writeStringField(fieldNumber: 2, value: mimeType)
        writer.writeBytesField(fieldNumber: 3, value: fileContent)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): fileName = try reader.readString()
        case (2, .lengthDelimited): mimeType = try reader.readString()
        case (3, .lengthDelimited): fileContent = try reader.readBytes()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct SegmentPointSplice: ProtoBinaryMessage {
    public var startIndex: Int32 = 0
    public var deleteCount: Int32 = 0
    public var insertedPoints: [GeoPoint] = []
    public var insertedPointsList: [GeoPoint] { insertedPoints }
    public var insertedPointsCount: Int { insertedPoints.count }

    public init() {}
    public init(startIndex: Int32 = 0, deleteCount: Int32 = 0, insertedPoints: [GeoPoint] = []) {
        self.startIndex = startIndex
        self.deleteCount = deleteCount
        self.insertedPoints = insertedPoints
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: startIndex)
        writer.writeInt32Field(fieldNumber: 2, value: deleteCount)
        writer.writeRepeatedMessageField(fieldNumber: 3, messages: insertedPoints)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): startIndex = try reader.readInt32()
        case (2, .varint): deleteCount = try reader.readInt32()
        case (3, .lengthDelimited): insertedPoints.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct SegmentUpdate: ProtoBinaryMessage {
    public var segmentId: String = ""
    public var segmentStorage: Segment? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil
    public var pointSplices: [SegmentPointSplice] = []

    public var segment: Segment {
        get { segmentStorage ?? Segment() }
        set { segmentStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }
    public var hasSegment: Bool { segmentStorage != nil }
    public var hasUpdateMask: Bool { updateMaskStorage != nil }
    public var pointSplicesList: [SegmentPointSplice] { pointSplices }
    public var pointSplicesCount: Int { pointSplices.count }

    public init() {}
    public init(
        segmentId: String = "",
        segment: Segment? = nil,
        updateMask: ProtoFieldMask? = nil,
        pointSplices: [SegmentPointSplice] = []
    ) {
        self.segmentId = segmentId
        self.segmentStorage = segment
        self.updateMaskStorage = updateMask
        self.pointSplices = pointSplices
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: segmentId)
        writer.writeOptionalMessageField(fieldNumber: 2, message: segmentStorage)
        writer.writeOptionalMessageField(fieldNumber: 3, message: updateMaskStorage)
        writer.writeRepeatedMessageField(fieldNumber: 4, messages: pointSplices)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): segmentId = try reader.readString()
        case (2, .lengthDelimited): segmentStorage = try reader.readMessage()
        case (3, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        case (4, .lengthDelimited): pointSplices.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct WaypointUpdate: ProtoBinaryMessage {
    public var waypointId: String = ""
    public var waypointStorage: Waypoint? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var waypoint: Waypoint {
        get { waypointStorage ?? Waypoint() }
        set { waypointStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }
    public var hasWaypoint: Bool { waypointStorage != nil }
    public var hasUpdateMask: Bool { updateMaskStorage != nil }

    public init() {}
    public init(
        waypointId: String = "",
        waypoint: Waypoint? = nil,
        updateMask: ProtoFieldMask? = nil
    ) {
        self.waypointId = waypointId
        self.waypointStorage = waypoint
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: waypointId)
        writer.writeOptionalMessageField(fieldNumber: 2, message: waypointStorage)
        writer.writeOptionalMessageField(fieldNumber: 3, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): waypointId = try reader.readString()
        case (2, .lengthDelimited): waypointStorage = try reader.readMessage()
        case (3, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GpxTrackDiff: ProtoBinaryMessage {
    public var addedSegments: [Segment] = []
    public var updatedSegments: [SegmentUpdate] = []
    public var deletedSegmentIds: [String] = []
    public var segmentOrderIds: [String] = []
    public var addedWaypoints: [Waypoint] = []
    public var updatedWaypoints: [WaypointUpdate] = []
    public var deletedWaypointIds: [String] = []
    public var waypointOrderIds: [String] = []

    public var addedSegmentsList: [Segment] { addedSegments }
    public var updatedSegmentsList: [SegmentUpdate] { updatedSegments }
    public var deletedSegmentIdsList: [String] { deletedSegmentIds }
    public var segmentOrderIdsList: [String] { segmentOrderIds }
    public var addedWaypointsList: [Waypoint] { addedWaypoints }
    public var updatedWaypointsList: [WaypointUpdate] { updatedWaypoints }
    public var deletedWaypointIdsList: [String] { deletedWaypointIds }
    public var waypointOrderIdsList: [String] { waypointOrderIds }

    public init() {}
    public init(
        addedSegments: [Segment] = [],
        updatedSegments: [SegmentUpdate] = [],
        deletedSegmentIds: [String] = [],
        segmentOrderIds: [String] = [],
        addedWaypoints: [Waypoint] = [],
        updatedWaypoints: [WaypointUpdate] = [],
        deletedWaypointIds: [String] = [],
        waypointOrderIds: [String] = []
    ) {
        self.addedSegments = addedSegments
        self.updatedSegments = updatedSegments
        self.deletedSegmentIds = deletedSegmentIds
        self.segmentOrderIds = segmentOrderIds
        self.addedWaypoints = addedWaypoints
        self.updatedWaypoints = updatedWaypoints
        self.deletedWaypointIds = deletedWaypointIds
        self.waypointOrderIds = waypointOrderIds
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: addedSegments)
        writer.writeRepeatedMessageField(fieldNumber: 2, messages: updatedSegments)
        writer.writeRepeatedStringField(fieldNumber: 3, values: deletedSegmentIds)
        writer.writeRepeatedStringField(fieldNumber: 4, values: segmentOrderIds)
        writer.writeRepeatedMessageField(fieldNumber: 5, messages: addedWaypoints)
        writer.writeRepeatedMessageField(fieldNumber: 6, messages: updatedWaypoints)
        writer.writeRepeatedStringField(fieldNumber: 7, values: deletedWaypointIds)
        writer.writeRepeatedStringField(fieldNumber: 8, values: waypointOrderIds)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): addedSegments.append(try reader.readMessage())
        case (2, .lengthDelimited): updatedSegments.append(try reader.readMessage())
        case (3, .lengthDelimited): deletedSegmentIds.append(try reader.readString())
        case (4, .lengthDelimited): segmentOrderIds.append(try reader.readString())
        case (5, .lengthDelimited): addedWaypoints.append(try reader.readMessage())
        case (6, .lengthDelimited): updatedWaypoints.append(try reader.readMessage())
        case (7, .lengthDelimited): deletedWaypointIds.append(try reader.readString())
        case (8, .lengthDelimited): waypointOrderIds.append(try reader.readString())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateGpxTrackRequest: ProtoBinaryMessage {
    public var gpxTrackStorage: GpxTrack? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil
    public var diffStorage: GpxTrackDiff? = nil

    public var gpxTrack: GpxTrack {
        get { gpxTrackStorage ?? GpxTrack() }
        set { gpxTrackStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }
    public var diff: GpxTrackDiff {
        get { diffStorage ?? GpxTrackDiff() }
        set { diffStorage = newValue }
    }
    public var hasGpxTrack: Bool { gpxTrackStorage != nil }
    public var hasUpdateMask: Bool { updateMaskStorage != nil }
    public var hasDiff: Bool { diffStorage != nil }

    public init() {}
    public init(
        gpxTrack: GpxTrack,
        updateMask: ProtoFieldMask? = nil,
        diff: GpxTrackDiff? = nil
    ) {
        self.gpxTrackStorage = gpxTrack
        self.updateMaskStorage = updateMask
        self.diffStorage = diff
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: gpxTrackStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
        writer.writeOptionalMessageField(fieldNumber: 3, message: diffStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): gpxTrackStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        case (3, .lengthDelimited): diffStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteGpxTrackRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ShareGpxTrackRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - history.proto

public struct HistoryEntry: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public enum DescentStatus: Int32, CaseIterable, Sendable, Hashable {
        case descentStatusUnspecified = 0
        case passed = 1
        case evacuated = 2
        case leaved = 3

        public static let DESCENT_STATUS_UNSPECIFIED: DescentStatus = .descentStatusUnspecified
        public static let PASSED: DescentStatus = .passed
        public static let EVACUATED: DescentStatus = .evacuated
        public static let LEAVED: DescentStatus = .leaved

        public var number: Int32 { rawValue }
        public static func forNumber(_ rawNumber: Int32) -> DescentStatus? { DescentStatus(rawValue: rawNumber) }
    }

    public struct UserDescent: ProtoBinaryMessage {
        public var userId: String = ""
        public var status: DescentStatus = .descentStatusUnspecified

        public init() {}
        public init(userId: String = "", status: DescentStatus = .descentStatusUnspecified) {
            self.userId = userId
            self.status = status
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: userId)
            writer.writeEnumField(fieldNumber: 2, rawNumber: status.rawValue)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): userId = try reader.readString()
            case (2, .varint): status = DescentStatus(rawValue: try reader.readInt32()) ?? .descentStatusUnspecified
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var name: String = ""
    public var canyon: String = ""
    public var canyonName: String = ""
    public var dateStorage: ProtoDate? = nil
    public var order: Int32 = 0
    public var userStatuses: [UserDescent] = []

    public var date: ProtoDate {
        get { dateStorage ?? ProtoDate() }
        set { dateStorage = newValue }
    }
    public var hasDate: Bool { dateStorage != nil }
    public var userStatusesList: [UserDescent] { userStatuses }
    public var userStatusesCount: Int { userStatuses.count }

    public init() {}

    public init(
        name: String = "",
        canyon: String = "",
        canyonName: String = "",
        date: ProtoDate? = nil,
        order: Int32 = 0,
        userStatuses: [UserDescent] = []
    ) {
        self.name = name
        self.canyon = canyon
        self.canyonName = canyonName
        self.dateStorage = date
        self.order = order
        self.userStatuses = userStatuses
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: canyon)
        writer.writeStringField(fieldNumber: 3, value: canyonName)
        writer.writeOptionalMessageField(fieldNumber: 4, message: dateStorage)
        writer.writeInt32Field(fieldNumber: 5, value: order)
        writer.writeRepeatedMessageField(fieldNumber: 6, messages: userStatuses)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): canyon = try reader.readString()
        case (3, .lengthDelimited): canyonName = try reader.readString()
        case (4, .lengthDelimited): dateStorage = try reader.readMessage()
        case (5, .varint): order = try reader.readInt32()
        case (6, .lengthDelimited): userStatuses.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct HistoryTrip: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public var name: String = ""
    public var photosLink: String = ""
    public var entries: [HistoryEntry] = []

    public var entriesList: [HistoryEntry] { entries }
    public var entriesCount: Int { entries.count }

    public init() {}
    public init(name: String = "", photosLink: String = "", entries: [HistoryEntry] = []) {
        self.name = name
        self.photosLink = photosLink
        self.entries = entries
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: photosLink)
        writer.writeRepeatedMessageField(fieldNumber: 3, messages: entries)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): photosLink = try reader.readString()
        case (3, .lengthDelimited): entries.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListHistoryTripsRequest: ProtoBinaryMessage {
    public var year: Int32? = nil

    public init() {}
    public init(year: Int32? = nil) { self.year = year }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalInt32Field(fieldNumber: 1, value: year)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .varint {
            year = try reader.readInt32()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListHistoryTripsResponse: ProtoBinaryMessage {
    public var trips: [HistoryTrip] = []
    public var tripsList: [HistoryTrip] { trips }
    public var tripsCount: Int { trips.count }

    public init() {}
    public init(trips: [HistoryTrip]) { self.trips = trips }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: trips)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            trips.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct HistoryYearSummary: ProtoBinaryMessage {
    public var year: Int32 = 0
    public var canyonCount: Int32 = 0

    public init() {}
    public init(year: Int32, canyonCount: Int32) {
        self.year = year
        self.canyonCount = canyonCount
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: year)
        writer.writeInt32Field(fieldNumber: 2, value: canyonCount)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): year = try reader.readInt32()
        case (2, .varint): canyonCount = try reader.readInt32()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListHistoryYearsRequest: ProtoBinaryMessage {
    public init() {}
    public static func getDefaultInstance() -> ListHistoryYearsRequest { ListHistoryYearsRequest() }
    public func encodeToProtoWire(writer: inout ProtoWireWriter) {}
    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        try reader.skipField(wireType: wireType)
    }
}

public struct ListHistoryYearsResponse: ProtoBinaryMessage {
    public var yearSummaries: [HistoryYearSummary] = []
    public var yearSummariesList: [HistoryYearSummary] { yearSummaries }
    public var yearSummariesCount: Int { yearSummaries.count }

    public init() {}
    public init(yearSummaries: [HistoryYearSummary]) { self.yearSummaries = yearSummaries }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: yearSummaries)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            yearSummaries.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct BatchUpdateHistoryTripsRequest: ProtoBinaryMessage {
    public var trips: [HistoryTrip] = []
    public var deleteNames: [String] = []

    public var tripsList: [HistoryTrip] { trips }
    public var tripsCount: Int { trips.count }
    public var deleteNamesList: [String] { deleteNames }
    public var deleteNamesCount: Int { deleteNames.count }

    public init() {}
    public init(trips: [HistoryTrip] = [], deleteNames: [String] = []) {
        self.trips = trips
        self.deleteNames = deleteNames
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: trips)
        writer.writeRepeatedStringField(fieldNumber: 2, values: deleteNames)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): trips.append(try reader.readMessage())
        case (2, .lengthDelimited): deleteNames.append(try reader.readString())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct BatchUpdateHistoryTripsResponse: ProtoBinaryMessage {
    public var trips: [HistoryTrip] = []
    public var tripsList: [HistoryTrip] { trips }
    public var tripsCount: Int { trips.count }

    public init() {}
    public init(trips: [HistoryTrip]) { self.trips = trips }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: trips)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            trips.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - trips.proto

public struct TripParticipant: ProtoBinaryMessage {
    public enum Status: Int32, CaseIterable, Sendable, Hashable {
        case statusUnspecified = 0
        case pending = 1
        case approved = 2
        case rejected = 3
        case twiceRejected = 4

        public static let STATUS_UNSPECIFIED: Status = .statusUnspecified
        public static let PENDING: Status = .pending
        public static let APPROVED: Status = .approved
        public static let REJECTED: Status = .rejected
        public static let TWICE_REJECTED: Status = .twiceRejected

        public var number: Int32 { rawValue }
    }

    public var user: String = ""
    public var status: Status = .statusUnspecified

    public init() {}
    public init(user: String = "", status: Status = .statusUnspecified) {
        self.user = user
        self.status = status
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: user)
        writer.writeEnumField(fieldNumber: 2, rawNumber: status.rawValue)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): user = try reader.readString()
        case (2, .varint): status = Status(rawValue: try reader.readInt32()) ?? .statusUnspecified
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct CanyonStep: ProtoBinaryMessage {
    public var canyon: String = ""
    public var region: String = ""
    public var day: String = ""
    public var driveDurationStorage: ProtoDuration? = nil
    public var shuttleDurationStorage: ProtoDuration? = nil
    public var sameDay: Bool = false
    public var locationStorage: ProtoLatLng? = nil
    public var canyonDurationStorage: ProtoDuration? = nil
    public var driveBackStorage: Bool? = nil

    public var driveDuration: ProtoDuration {
        get { driveDurationStorage ?? ProtoDuration() }
        set { driveDurationStorage = newValue }
    }
    public var shuttleDuration: ProtoDuration {
        get { shuttleDurationStorage ?? ProtoDuration() }
        set { shuttleDurationStorage = newValue }
    }
    public var location: ProtoLatLng {
        get { locationStorage ?? ProtoLatLng() }
        set { locationStorage = newValue }
    }
    public var canyonDuration: ProtoDuration {
        get { canyonDurationStorage ?? ProtoDuration() }
        set { canyonDurationStorage = newValue }
    }
    public var driveBack: Bool {
        get { driveBackStorage ?? false }
        set { driveBackStorage = newValue }
    }
    public var hasDriveDuration: Bool { driveDurationStorage != nil }
    public var hasShuttleDuration: Bool { shuttleDurationStorage != nil }
    public var hasLocation: Bool { locationStorage != nil }
    public var hasCanyonDuration: Bool { canyonDurationStorage != nil }
    public var hasDriveBack: Bool { driveBackStorage != nil }

    public init() {}

    public init(
        canyon: String = "",
        region: String = "",
        day: String = "",
        driveDuration: ProtoDuration? = nil,
        shuttleDuration: ProtoDuration? = nil,
        sameDay: Bool = false,
        location: ProtoLatLng? = nil,
        canyonDuration: ProtoDuration? = nil,
        driveBack: Bool? = nil
    ) {
        self.canyon = canyon
        self.region = region
        self.day = day
        self.driveDurationStorage = driveDuration
        self.shuttleDurationStorage = shuttleDuration
        self.sameDay = sameDay
        self.locationStorage = location
        self.canyonDurationStorage = canyonDuration
        self.driveBackStorage = driveBack
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: canyon)
        writer.writeStringField(fieldNumber: 2, value: region)
        writer.writeStringField(fieldNumber: 3, value: day)
        writer.writeOptionalMessageField(fieldNumber: 4, message: driveDurationStorage)
        writer.writeOptionalMessageField(fieldNumber: 5, message: shuttleDurationStorage)
        writer.writeBoolField(fieldNumber: 6, value: sameDay)
        writer.writeOptionalMessageField(fieldNumber: 7, message: locationStorage)
        writer.writeOptionalMessageField(fieldNumber: 8, message: canyonDurationStorage)
        writer.writeOptionalBoolField(fieldNumber: 9, value: driveBackStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): canyon = try reader.readString()
        case (2, .lengthDelimited): region = try reader.readString()
        case (3, .lengthDelimited): day = try reader.readString()
        case (4, .lengthDelimited): driveDurationStorage = try reader.readMessage()
        case (5, .lengthDelimited): shuttleDurationStorage = try reader.readMessage()
        case (6, .varint): sameDay = try reader.readBool()
        case (7, .lengthDelimited): locationStorage = try reader.readMessage()
        case (8, .lengthDelimited): canyonDurationStorage = try reader.readMessage()
        case (9, .varint): driveBackStorage = try reader.readBool()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct FlightStep: ProtoBinaryMessage {
    public struct FlightStop: ProtoBinaryMessage {
        public var airport: String = ""
        public var layoverDurationStorage: ProtoDuration? = nil

        public var layoverDuration: ProtoDuration {
            get { layoverDurationStorage ?? ProtoDuration() }
            set { layoverDurationStorage = newValue }
        }
        public var hasLayoverDuration: Bool { layoverDurationStorage != nil }

        public init() {}
        public init(airport: String = "", layoverDuration: ProtoDuration? = nil) {
            self.airport = airport
            self.layoverDurationStorage = layoverDuration
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: airport)
            writer.writeOptionalMessageField(fieldNumber: 2, message: layoverDurationStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): airport = try reader.readString()
            case (2, .lengthDelimited): layoverDurationStorage = try reader.readMessage()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct FlightRoute: ProtoBinaryMessage {
        public var departureAirport: String = ""
        public var arrivalAirport: String = ""
        public var scheduleStorage: RouteSchedule? = nil
        public var days: Int32 = 0
        public var stops: [FlightStop] = []
        public var sameDay: Bool = false
        public var departureLocationStorage: ProtoLatLng? = nil
        public var arrivalLocationStorage: ProtoLatLng? = nil

        public var schedule: RouteSchedule {
            get { scheduleStorage ?? RouteSchedule() }
            set { scheduleStorage = newValue }
        }
        public var departureLocation: ProtoLatLng {
            get { departureLocationStorage ?? ProtoLatLng() }
            set { departureLocationStorage = newValue }
        }
        public var arrivalLocation: ProtoLatLng {
            get { arrivalLocationStorage ?? ProtoLatLng() }
            set { arrivalLocationStorage = newValue }
        }
        public var hasSchedule: Bool { scheduleStorage != nil }
        public var hasDepartureLocation: Bool { departureLocationStorage != nil }
        public var hasArrivalLocation: Bool { arrivalLocationStorage != nil }
        public var stopsList: [FlightStop] { stops }
        public var stopsCount: Int { stops.count }

        public init() {}

        public init(
            departureAirport: String = "",
            arrivalAirport: String = "",
            schedule: RouteSchedule? = nil,
            days: Int32 = 0,
            stops: [FlightStop] = [],
            sameDay: Bool = false,
            departureLocation: ProtoLatLng? = nil,
            arrivalLocation: ProtoLatLng? = nil
        ) {
            self.departureAirport = departureAirport
            self.arrivalAirport = arrivalAirport
            self.scheduleStorage = schedule
            self.days = days
            self.stops = stops
            self.sameDay = sameDay
            self.departureLocationStorage = departureLocation
            self.arrivalLocationStorage = arrivalLocation
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: departureAirport)
            writer.writeStringField(fieldNumber: 2, value: arrivalAirport)
            writer.writeOptionalMessageField(fieldNumber: 3, message: scheduleStorage)
            writer.writeInt32Field(fieldNumber: 4, value: days)
            writer.writeRepeatedMessageField(fieldNumber: 5, messages: stops)
            writer.writeBoolField(fieldNumber: 6, value: sameDay)
            writer.writeOptionalMessageField(fieldNumber: 7, message: departureLocationStorage)
            writer.writeOptionalMessageField(fieldNumber: 8, message: arrivalLocationStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): departureAirport = try reader.readString()
            case (2, .lengthDelimited): arrivalAirport = try reader.readString()
            case (3, .lengthDelimited): scheduleStorage = try reader.readMessage()
            case (4, .varint): days = try reader.readInt32()
            case (5, .lengthDelimited): stops.append(try reader.readMessage())
            case (6, .varint): sameDay = try reader.readBool()
            case (7, .lengthDelimited): departureLocationStorage = try reader.readMessage()
            case (8, .lengthDelimited): arrivalLocationStorage = try reader.readMessage()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var isRoundTrip: Bool = false
    public var customReturn: Bool = false
    public var priceStorage: Price? = nil
    public var outboundFlightStorage: FlightRoute? = nil
    public var returnFlightStorage: FlightRoute? = nil

    public var price: Price {
        get { priceStorage ?? Price() }
        set { priceStorage = newValue }
    }
    public var outboundFlight: FlightRoute {
        get { outboundFlightStorage ?? FlightRoute() }
        set { outboundFlightStorage = newValue }
    }
    public var returnFlight: FlightRoute {
        get { returnFlightStorage ?? FlightRoute() }
        set { returnFlightStorage = newValue }
    }
    public var hasPrice: Bool { priceStorage != nil }
    public var hasOutboundFlight: Bool { outboundFlightStorage != nil }
    public var hasReturnFlight: Bool { returnFlightStorage != nil }

    public init() {}

    public init(
        isRoundTrip: Bool = false,
        customReturn: Bool = false,
        price: Price? = nil,
        outboundFlight: FlightRoute? = nil,
        returnFlight: FlightRoute? = nil
    ) {
        self.isRoundTrip = isRoundTrip
        self.customReturn = customReturn
        self.priceStorage = price
        self.outboundFlightStorage = outboundFlight
        self.returnFlightStorage = returnFlight
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeBoolField(fieldNumber: 1, value: isRoundTrip)
        writer.writeBoolField(fieldNumber: 2, value: customReturn)
        writer.writeOptionalMessageField(fieldNumber: 3, message: priceStorage)
        writer.writeOptionalMessageField(fieldNumber: 4, message: outboundFlightStorage)
        writer.writeOptionalMessageField(fieldNumber: 5, message: returnFlightStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): isRoundTrip = try reader.readBool()
        case (2, .varint): customReturn = try reader.readBool()
        case (3, .lengthDelimited): priceStorage = try reader.readMessage()
        case (4, .lengthDelimited): outboundFlightStorage = try reader.readMessage()
        case (5, .lengthDelimited): returnFlightStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DriveStep: ProtoBinaryMessage {
    public enum TransportType: Int32, CaseIterable, Sendable, Hashable {
        case transportTypeUnspecified = 0
        case personal = 1
        case rental = 2

        public static let TRANSPORT_TYPE_UNSPECIFIED: TransportType = .transportTypeUnspecified
        public static let PERSONAL: TransportType = .personal
        public static let RENTAL: TransportType = .rental

        public var number: Int32 { rawValue }
    }

    public struct DriveWaypoint: ProtoBinaryMessage {
        public var location: String = ""
        public var stopDurationStorage: ProtoDuration? = nil

        public var stopDuration: ProtoDuration {
            get { stopDurationStorage ?? ProtoDuration() }
            set { stopDurationStorage = newValue }
        }
        public var hasStopDuration: Bool { stopDurationStorage != nil }

        public init() {}
        public init(location: String = "", stopDuration: ProtoDuration? = nil) {
            self.location = location
            self.stopDurationStorage = stopDuration
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: location)
            writer.writeOptionalMessageField(fieldNumber: 2, message: stopDurationStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): location = try reader.readString()
            case (2, .lengthDelimited): stopDurationStorage = try reader.readMessage()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public struct DriveRoute: ProtoBinaryMessage {
        public var startLocation: String = ""
        public var endLocation: String = ""
        public var scheduleStorage: RouteSchedule? = nil
        public var stops: [DriveWaypoint] = []
        public var sameDay: Bool = false
        public var departureLocationStorage: ProtoLatLng? = nil
        public var arrivalLocationStorage: ProtoLatLng? = nil

        public var schedule: RouteSchedule {
            get { scheduleStorage ?? RouteSchedule() }
            set { scheduleStorage = newValue }
        }
        public var departureLocation: ProtoLatLng {
            get { departureLocationStorage ?? ProtoLatLng() }
            set { departureLocationStorage = newValue }
        }
        public var arrivalLocation: ProtoLatLng {
            get { arrivalLocationStorage ?? ProtoLatLng() }
            set { arrivalLocationStorage = newValue }
        }
        public var hasSchedule: Bool { scheduleStorage != nil }
        public var hasDepartureLocation: Bool { departureLocationStorage != nil }
        public var hasArrivalLocation: Bool { arrivalLocationStorage != nil }
        public var stopsList: [DriveWaypoint] { stops }
        public var stopsCount: Int { stops.count }

        public init() {}

        public init(
            startLocation: String = "",
            endLocation: String = "",
            schedule: RouteSchedule? = nil,
            stops: [DriveWaypoint] = [],
            sameDay: Bool = false,
            departureLocation: ProtoLatLng? = nil,
            arrivalLocation: ProtoLatLng? = nil
        ) {
            self.startLocation = startLocation
            self.endLocation = endLocation
            self.scheduleStorage = schedule
            self.stops = stops
            self.sameDay = sameDay
            self.departureLocationStorage = departureLocation
            self.arrivalLocationStorage = arrivalLocation
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: startLocation)
            writer.writeStringField(fieldNumber: 2, value: endLocation)
            writer.writeOptionalMessageField(fieldNumber: 3, message: scheduleStorage)
            writer.writeRepeatedMessageField(fieldNumber: 4, messages: stops)
            writer.writeBoolField(fieldNumber: 5, value: sameDay)
            writer.writeOptionalMessageField(fieldNumber: 6, message: departureLocationStorage)
            writer.writeOptionalMessageField(fieldNumber: 7, message: arrivalLocationStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): startLocation = try reader.readString()
            case (2, .lengthDelimited): endLocation = try reader.readString()
            case (3, .lengthDelimited): scheduleStorage = try reader.readMessage()
            case (4, .lengthDelimited): stops.append(try reader.readMessage())
            case (5, .varint): sameDay = try reader.readBool()
            case (6, .lengthDelimited): departureLocationStorage = try reader.readMessage()
            case (7, .lengthDelimited): arrivalLocationStorage = try reader.readMessage()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var transportType: TransportType = .transportTypeUnspecified
    public var isRoundTrip: Bool = false
    public var customReturn: Bool = false
    public var priceStorage: Price? = nil
    public var wayThereStorage: DriveRoute? = nil
    public var wayBackStorage: DriveRoute? = nil

    public var price: Price {
        get { priceStorage ?? Price() }
        set { priceStorage = newValue }
    }
    public var wayThere: DriveRoute {
        get { wayThereStorage ?? DriveRoute() }
        set { wayThereStorage = newValue }
    }
    public var wayBack: DriveRoute {
        get { wayBackStorage ?? DriveRoute() }
        set { wayBackStorage = newValue }
    }
    public var hasPrice: Bool { priceStorage != nil }
    public var hasWayThere: Bool { wayThereStorage != nil }
    public var hasWayBack: Bool { wayBackStorage != nil }

    public init() {}

    public init(
        transportType: TransportType = .transportTypeUnspecified,
        isRoundTrip: Bool = false,
        customReturn: Bool = false,
        price: Price? = nil,
        wayThere: DriveRoute? = nil,
        wayBack: DriveRoute? = nil
    ) {
        self.transportType = transportType
        self.isRoundTrip = isRoundTrip
        self.customReturn = customReturn
        self.priceStorage = price
        self.wayThereStorage = wayThere
        self.wayBackStorage = wayBack
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeEnumField(fieldNumber: 1, rawNumber: transportType.rawValue)
        writer.writeBoolField(fieldNumber: 2, value: isRoundTrip)
        writer.writeBoolField(fieldNumber: 3, value: customReturn)
        writer.writeOptionalMessageField(fieldNumber: 4, message: priceStorage)
        writer.writeOptionalMessageField(fieldNumber: 5, message: wayThereStorage)
        writer.writeOptionalMessageField(fieldNumber: 6, message: wayBackStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): transportType = TransportType(rawValue: try reader.readInt32()) ?? .transportTypeUnspecified
        case (2, .varint): isRoundTrip = try reader.readBool()
        case (3, .varint): customReturn = try reader.readBool()
        case (4, .lengthDelimited): priceStorage = try reader.readMessage()
        case (5, .lengthDelimited): wayThereStorage = try reader.readMessage()
        case (6, .lengthDelimited): wayBackStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct HousingStep: ProtoBinaryMessage {
    public enum HousingType: Int32, CaseIterable, Sendable, Hashable {
        case typeUnspecified = 0
        case rental = 1
        case camping = 2

        public static let TYPE_UNSPECIFIED: HousingType = .typeUnspecified
        public static let RENTAL: HousingType = .rental
        public static let CAMPING: HousingType = .camping

        public var number: Int32 { rawValue }
    }
    public typealias `Type` = HousingType

    public var type: HousingType = .typeUnspecified
    public var name: String = ""
    public var locationStorage: ProtoLatLng? = nil
    public var durationStorage: Duration? = nil
    public var priceStorage: Price? = nil
    public var moveOutNextDayStorage: Bool? = nil

    public var location: ProtoLatLng {
        get { locationStorage ?? ProtoLatLng() }
        set { locationStorage = newValue }
    }
    public var duration: Duration {
        get { durationStorage ?? Duration() }
        set { durationStorage = newValue }
    }
    public var price: Price {
        get { priceStorage ?? Price() }
        set { priceStorage = newValue }
    }
    public var moveOutNextDay: Bool {
        get { moveOutNextDayStorage ?? false }
        set { moveOutNextDayStorage = newValue }
    }
    public var hasLocation: Bool { locationStorage != nil }
    public var hasDuration: Bool { durationStorage != nil }
    public var hasPrice: Bool { priceStorage != nil }
    public var hasMoveOutNextDay: Bool { moveOutNextDayStorage != nil }

    public init() {}

    public init(
        type: HousingType = .typeUnspecified,
        name: String = "",
        location: ProtoLatLng? = nil,
        duration: Duration? = nil,
        price: Price? = nil,
        moveOutNextDay: Bool? = nil
    ) {
        self.type = type
        self.name = name
        self.locationStorage = location
        self.durationStorage = duration
        self.priceStorage = price
        self.moveOutNextDayStorage = moveOutNextDay
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeEnumField(fieldNumber: 1, rawNumber: type.rawValue)
        writer.writeStringField(fieldNumber: 2, value: name)
        writer.writeOptionalMessageField(fieldNumber: 3, message: locationStorage)
        writer.writeOptionalMessageField(fieldNumber: 4, message: durationStorage)
        writer.writeOptionalMessageField(fieldNumber: 5, message: priceStorage)
        writer.writeOptionalBoolField(fieldNumber: 6, value: moveOutNextDayStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): type = HousingType(rawValue: try reader.readInt32()) ?? .typeUnspecified
        case (2, .lengthDelimited): name = try reader.readString()
        case (3, .lengthDelimited): locationStorage = try reader.readMessage()
        case (4, .lengthDelimited): durationStorage = try reader.readMessage()
        case (5, .lengthDelimited): priceStorage = try reader.readMessage()
        case (6, .varint): moveOutNextDayStorage = try reader.readBool()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct RestStep: ProtoBinaryMessage {
    public var day: String = ""
    public var sameDay: Bool = false

    public init() {}
    public init(day: String = "", sameDay: Bool = false) {
        self.day = day
        self.sameDay = sameDay
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: day)
        writer.writeBoolField(fieldNumber: 2, value: sameDay)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): day = try reader.readString()
        case (2, .varint): sameDay = try reader.readBool()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct RegionChangeStep: ProtoBinaryMessage {
    public var targetRegion: String = ""

    public init() {}
    public init(targetRegion: String = "") { self.targetRegion = targetRegion }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: targetRegion)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            targetRegion = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct TripStep: ProtoBinaryMessage, Identifiable {
    public var id: String = ""
    public var title: String = ""
    public var sortOrder: Int32 = 0
    public var parentStepId: String = ""
    public var canyonStorage: CanyonStep? = nil
    public var flightStorage: FlightStep? = nil
    public var driveStorage: DriveStep? = nil
    public var housingStorage: HousingStep? = nil
    public var restStorage: RestStep? = nil
    public var regionChangeStorage: RegionChangeStep? = nil

    public var canyon: CanyonStep {
        get { canyonStorage ?? CanyonStep() }
        set {
            clearOneofSteps()
            canyonStorage = newValue
        }
    }
    public var flight: FlightStep {
        get { flightStorage ?? FlightStep() }
        set {
            clearOneofSteps()
            flightStorage = newValue
        }
    }
    public var drive: DriveStep {
        get { driveStorage ?? DriveStep() }
        set {
            clearOneofSteps()
            driveStorage = newValue
        }
    }
    public var housing: HousingStep {
        get { housingStorage ?? HousingStep() }
        set {
            clearOneofSteps()
            housingStorage = newValue
        }
    }
    public var rest: RestStep {
        get { restStorage ?? RestStep() }
        set {
            clearOneofSteps()
            restStorage = newValue
        }
    }
    public var regionChange: RegionChangeStep {
        get { regionChangeStorage ?? RegionChangeStep() }
        set {
            clearOneofSteps()
            regionChangeStorage = newValue
        }
    }

    public var hasCanyon: Bool { canyonStorage != nil }
    public var hasFlight: Bool { flightStorage != nil }
    public var hasDrive: Bool { driveStorage != nil }
    public var hasHousing: Bool { housingStorage != nil }
    public var hasRest: Bool { restStorage != nil }
    public var hasRegionChange: Bool { regionChangeStorage != nil }

    private mutating func clearOneofSteps() {
        canyonStorage = nil
        flightStorage = nil
        driveStorage = nil
        housingStorage = nil
        restStorage = nil
        regionChangeStorage = nil
    }

    public init() {}

    public init(
        id: String = "",
        title: String = "",
        sortOrder: Int32 = 0,
        parentStepId: String = "",
        canyon: CanyonStep? = nil,
        flight: FlightStep? = nil,
        drive: DriveStep? = nil,
        housing: HousingStep? = nil,
        rest: RestStep? = nil,
        regionChange: RegionChangeStep? = nil
    ) {
        self.id = id
        self.title = title
        self.sortOrder = sortOrder
        self.parentStepId = parentStepId
        self.canyonStorage = canyon
        self.flightStorage = flight
        self.driveStorage = drive
        self.housingStorage = housing
        self.restStorage = rest
        self.regionChangeStorage = regionChange
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: id)
        writer.writeStringField(fieldNumber: 2, value: title)
        writer.writeInt32Field(fieldNumber: 3, value: sortOrder)
        writer.writeStringField(fieldNumber: 4, value: parentStepId)
        writer.writeOptionalMessageField(fieldNumber: 5, message: canyonStorage)
        writer.writeOptionalMessageField(fieldNumber: 6, message: flightStorage)
        writer.writeOptionalMessageField(fieldNumber: 7, message: driveStorage)
        writer.writeOptionalMessageField(fieldNumber: 8, message: housingStorage)
        writer.writeOptionalMessageField(fieldNumber: 9, message: restStorage)
        writer.writeOptionalMessageField(fieldNumber: 10, message: regionChangeStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): id = try reader.readString()
        case (2, .lengthDelimited): title = try reader.readString()
        case (3, .varint): sortOrder = try reader.readInt32()
        case (4, .lengthDelimited): parentStepId = try reader.readString()
        case (5, .lengthDelimited):
            clearOneofSteps()
            canyonStorage = try reader.readMessage()
        case (6, .lengthDelimited):
            clearOneofSteps()
            flightStorage = try reader.readMessage()
        case (7, .lengthDelimited):
            clearOneofSteps()
            driveStorage = try reader.readMessage()
        case (8, .lengthDelimited):
            clearOneofSteps()
            housingStorage = try reader.readMessage()
        case (9, .lengthDelimited):
            clearOneofSteps()
            restStorage = try reader.readMessage()
        case (10, .lengthDelimited):
            clearOneofSteps()
            regionChangeStorage = try reader.readMessage()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct TripNote: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public var name: String = ""
    public var author: String = ""
    public var text: String = ""
    public var createTimeStorage: ProtoTimestamp? = nil

    public var createTime: ProtoTimestamp {
        get { createTimeStorage ?? ProtoTimestamp() }
        set { createTimeStorage = newValue }
    }
    public var hasCreateTime: Bool { createTimeStorage != nil }

    public init() {}
    public init(name: String = "", author: String = "", text: String = "", createTime: ProtoTimestamp? = nil) {
        self.name = name
        self.author = author
        self.text = text
        self.createTimeStorage = createTime
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: author)
        writer.writeStringField(fieldNumber: 3, value: text)
        writer.writeOptionalMessageField(fieldNumber: 4, message: createTimeStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): author = try reader.readString()
        case (3, .lengthDelimited): text = try reader.readString()
        case (4, .lengthDelimited): createTimeStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct Trip: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public enum Status: Int32, CaseIterable, Sendable, Hashable {
        case statusUnspecified = 0
        case planned = 1
        case inProgress = 2
        case finished = 3
        case cancelled = 4

        public static let STATUS_UNSPECIFIED: Status = .statusUnspecified
        public static let PLANNED: Status = .planned
        public static let IN_PROGRESS: Status = .inProgress
        public static let FINISHED: Status = .finished
        public static let CANCELLED: Status = .cancelled

        public var number: Int32 { rawValue }
    }

    public var name: String = ""
    public var title: String = ""
    public var description: String = ""
    public var region: String = ""
    public var status: Status = .statusUnspecified
    public var creator: String = ""
    public var participants: [TripParticipant] = []
    public var itinerarySteps: [TripStep] = []
    public var notes: [TripNote] = []
    public var durationStorage: Duration? = nil
    public var lockedRegion: String = ""
    public var alternativeTo: String = ""
    public var extendedFrom: String = ""
    public var risks: [String] = []

    public var duration: Duration {
        get { durationStorage ?? Duration() }
        set { durationStorage = newValue }
    }
    public var hasDuration: Bool { durationStorage != nil }
    public var participantsList: [TripParticipant] { participants }
    public var participantsCount: Int { participants.count }
    public var itineraryStepsList: [TripStep] { itinerarySteps }
    public var itineraryStepsCount: Int { itinerarySteps.count }
    public var notesList: [TripNote] { notes }
    public var notesCount: Int { notes.count }
    public var risksList: [String] { risks }
    public var risksCount: Int { risks.count }

    public init() {}

    public init(
        name: String = "",
        title: String = "",
        description: String = "",
        region: String = "",
        status: Status = .statusUnspecified,
        creator: String = "",
        participants: [TripParticipant] = [],
        itinerarySteps: [TripStep] = [],
        notes: [TripNote] = [],
        duration: Duration? = nil,
        lockedRegion: String = "",
        alternativeTo: String = "",
        extendedFrom: String = "",
        risks: [String] = []
    ) {
        self.name = name
        self.title = title
        self.description = description
        self.region = region
        self.status = status
        self.creator = creator
        self.participants = participants
        self.itinerarySteps = itinerarySteps
        self.notes = notes
        self.durationStorage = duration
        self.lockedRegion = lockedRegion
        self.alternativeTo = alternativeTo
        self.extendedFrom = extendedFrom
        self.risks = risks
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: title)
        writer.writeStringField(fieldNumber: 3, value: description)
        writer.writeStringField(fieldNumber: 4, value: region)
        writer.writeEnumField(fieldNumber: 5, rawNumber: status.rawValue)
        writer.writeStringField(fieldNumber: 6, value: creator)
        writer.writeRepeatedMessageField(fieldNumber: 7, messages: participants)
        writer.writeRepeatedMessageField(fieldNumber: 8, messages: itinerarySteps)
        writer.writeRepeatedMessageField(fieldNumber: 9, messages: notes)
        writer.writeOptionalMessageField(fieldNumber: 10, message: durationStorage)
        writer.writeStringField(fieldNumber: 11, value: lockedRegion)
        if !alternativeTo.isEmpty {
            writer.writeStringField(fieldNumber: 12, value: alternativeTo)
        } else if !extendedFrom.isEmpty {
            writer.writeStringField(fieldNumber: 13, value: extendedFrom)
        }
        writer.writeRepeatedStringField(fieldNumber: 14, values: risks)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): title = try reader.readString()
        case (3, .lengthDelimited): description = try reader.readString()
        case (4, .lengthDelimited): region = try reader.readString()
        case (5, .varint): status = Status(rawValue: try reader.readInt32()) ?? .statusUnspecified
        case (6, .lengthDelimited): creator = try reader.readString()
        case (7, .lengthDelimited): participants.append(try reader.readMessage())
        case (8, .lengthDelimited): itinerarySteps.append(try reader.readMessage())
        case (9, .lengthDelimited): notes.append(try reader.readMessage())
        case (10, .lengthDelimited): durationStorage = try reader.readMessage()
        case (11, .lengthDelimited): lockedRegion = try reader.readString()
        case (12, .lengthDelimited):
            alternativeTo = try reader.readString()
            extendedFrom = ""
        case (13, .lengthDelimited):
            extendedFrom = try reader.readString()
            alternativeTo = ""
        case (14, .lengthDelimited): risks.append(try reader.readString())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListTripsRequest: ProtoBinaryMessage {
    public var readMaskStorage: ProtoFieldMask? = nil

    public init() {}
    public static func getDefaultInstance() -> ListTripsRequest { ListTripsRequest() }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: readMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            readMaskStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListTripsResponse: ProtoBinaryMessage {
    public var trips: [Trip] = []
    public var tripsList: [Trip] { trips }
    public var tripsCount: Int { trips.count }

    public init() {}
    public init(trips: [Trip]) { self.trips = trips }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: trips)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            trips.append(try reader.readMessage())
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetTripRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateTripRequest: ProtoBinaryMessage {
    public var tripStorage: Trip? = nil
    public var trip: Trip {
        get { tripStorage ?? Trip() }
        set { tripStorage = newValue }
    }

    public init() {}
    public init(trip: Trip) { self.tripStorage = trip }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: tripStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            tripStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateTripRequest: ProtoBinaryMessage {
    public var tripStorage: Trip? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var trip: Trip {
        get { tripStorage ?? Trip() }
        set { tripStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(trip: Trip, updateMask: ProtoFieldMask? = nil) {
        self.tripStorage = trip
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: tripStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): tripStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteTripRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - expenses.proto

public struct ExpenseTrip: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public var name: String = ""
    public var title: String = ""
    public var description: String = ""
    public var currencyCode: String = ""
    public var startDate: String = ""
    public var endDate: String = ""
    public var organizer: String = ""
    public var participants: [String] = []
    public var createTimeStorage: ProtoTimestamp? = nil
    public var settledBy: [String: String] = [:]
    public var isDeleted: Bool = false

    public var participantsList: [String] { participants }
    public var participantsCount: Int { participants.count }
    public var settledByMap: [String: String] { settledBy }
    public var settledByCount: Int { settledBy.count }
    public var createTime: ProtoTimestamp {
        get { createTimeStorage ?? ProtoTimestamp() }
        set { createTimeStorage = newValue }
    }
    public var hasCreateTime: Bool { createTimeStorage != nil }

    public init() {}

    public init(
        name: String = "",
        title: String = "",
        description: String = "",
        currencyCode: String = "",
        startDate: String = "",
        endDate: String = "",
        organizer: String = "",
        participants: [String] = [],
        createTime: ProtoTimestamp? = nil,
        settledBy: [String: String] = [:],
        isDeleted: Bool = false
    ) {
        self.name = name
        self.title = title
        self.description = description
        self.currencyCode = currencyCode
        self.startDate = startDate
        self.endDate = endDate
        self.organizer = organizer
        self.participants = participants
        self.createTimeStorage = createTime
        self.settledBy = settledBy
        self.isDeleted = isDeleted
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: title)
        writer.writeStringField(fieldNumber: 3, value: description)
        writer.writeStringField(fieldNumber: 4, value: currencyCode)
        writer.writeStringField(fieldNumber: 5, value: startDate)
        writer.writeStringField(fieldNumber: 6, value: endDate)
        writer.writeStringField(fieldNumber: 7, value: organizer)
        writer.writeRepeatedStringField(fieldNumber: 8, values: participants)
        writer.writeOptionalMessageField(fieldNumber: 9, message: createTimeStorage)
        writer.writeStringToStringMapField(fieldNumber: 10, mapEntries: settledBy)
        writer.writeBoolField(fieldNumber: 11, value: isDeleted)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): title = try reader.readString()
        case (3, .lengthDelimited): description = try reader.readString()
        case (4, .lengthDelimited): currencyCode = try reader.readString()
        case (5, .lengthDelimited): startDate = try reader.readString()
        case (6, .lengthDelimited): endDate = try reader.readString()
        case (7, .lengthDelimited): organizer = try reader.readString()
        case (8, .lengthDelimited): participants.append(try reader.readString())
        case (9, .lengthDelimited): createTimeStorage = try reader.readMessage()
        case (10, .lengthDelimited):
            let mapEntry = try reader.readStringToStringMapEntry()
            settledBy[mapEntry.key] = mapEntry.value
        case (11, .varint): isDeleted = try reader.readBool()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct Expense: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public enum Category: Int32, CaseIterable, Sendable, Hashable {
        case categoryUnspecified = 0
        case groceries = 1
        case restaurant = 2
        case carRental = 3
        case gas = 4
        case lodging = 5
        case permit = 6
        case flight = 7
        case gear = 8
        case reimburse = 9
        case general = 10
        case other = 11

        public static let CATEGORY_UNSPECIFIED: Category = .categoryUnspecified
        public static let GROCERIES: Category = .groceries
        public static let RESTAURANT: Category = .restaurant
        public static let CAR_RENTAL: Category = .carRental
        public static let GAS: Category = .gas
        public static let LODGING: Category = .lodging
        public static let PERMIT: Category = .permit
        public static let FLIGHT: Category = .flight
        public static let GEAR: Category = .gear
        public static let REIMBURSE: Category = .reimburse
        public static let GENERAL: Category = .general
        public static let OTHER: Category = .other

        public var number: Int32 { rawValue }
    }

    public enum SplitType: Int32, CaseIterable, Sendable, Hashable {
        case splitTypeUnspecified = 0
        case equal = 1
        case parts = 2
        case amount = 3

        public static let SPLIT_TYPE_UNSPECIFIED: SplitType = .splitTypeUnspecified
        public static let EQUAL: SplitType = .equal
        public static let PARTS: SplitType = .parts
        public static let AMOUNT: SplitType = .amount

        public var number: Int32 { rawValue }
    }

    public struct Split: ProtoBinaryMessage {
        public var user: String = ""
        public var amountStorage: Money? = nil
        public var isSettled: Bool = false
        public var parts: Double = 0.0

        public var amount: Money {
            get { amountStorage ?? Money() }
            set { amountStorage = newValue }
        }
        public var hasAmount: Bool { amountStorage != nil }

        public init() {}
        public init(user: String = "", amount: Money? = nil, isSettled: Bool = false, parts: Double = 0.0) {
            self.user = user
            self.amountStorage = amount
            self.isSettled = isSettled
            self.parts = parts
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: user)
            writer.writeOptionalMessageField(fieldNumber: 2, message: amountStorage)
            writer.writeBoolField(fieldNumber: 3, value: isSettled)
            writer.writeDoubleField(fieldNumber: 4, value: parts)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): user = try reader.readString()
            case (2, .lengthDelimited): amountStorage = try reader.readMessage()
            case (3, .varint): isSettled = try reader.readBool()
            case (4, _): parts = try reader.readDouble(wireType: wireType)
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var name: String = ""
    public var title: String = ""
    public var payer: String = ""
    public var amountStorage: Money? = nil
    public var category: Category = .categoryUnspecified
    public var description: String = ""
    public var splits: [Split] = []
    public var createTimeStorage: ProtoTimestamp? = nil
    public var updateTimeStorage: ProtoTimestamp? = nil
    public var splitType: SplitType = .splitTypeUnspecified
    public var date: String = ""

    public var amount: Money {
        get { amountStorage ?? Money() }
        set { amountStorage = newValue }
    }
    public var createTime: ProtoTimestamp {
        get { createTimeStorage ?? ProtoTimestamp() }
        set { createTimeStorage = newValue }
    }
    public var updateTime: ProtoTimestamp {
        get { updateTimeStorage ?? ProtoTimestamp() }
        set { updateTimeStorage = newValue }
    }
    public var hasAmount: Bool { amountStorage != nil }
    public var hasCreateTime: Bool { createTimeStorage != nil }
    public var hasUpdateTime: Bool { updateTimeStorage != nil }
    public var splitsList: [Split] { splits }
    public var splitsCount: Int { splits.count }

    public init() {}

    public init(
        name: String = "",
        title: String = "",
        payer: String = "",
        amount: Money? = nil,
        category: Category = .categoryUnspecified,
        description: String = "",
        splits: [Split] = [],
        createTime: ProtoTimestamp? = nil,
        updateTime: ProtoTimestamp? = nil,
        splitType: SplitType = .splitTypeUnspecified,
        date: String = ""
    ) {
        self.name = name
        self.title = title
        self.payer = payer
        self.amountStorage = amount
        self.category = category
        self.description = description
        self.splits = splits
        self.createTimeStorage = createTime
        self.updateTimeStorage = updateTime
        self.splitType = splitType
        self.date = date
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: title)
        writer.writeStringField(fieldNumber: 3, value: payer)
        writer.writeOptionalMessageField(fieldNumber: 4, message: amountStorage)
        writer.writeEnumField(fieldNumber: 5, rawNumber: category.rawValue)
        writer.writeStringField(fieldNumber: 6, value: description)
        writer.writeRepeatedMessageField(fieldNumber: 7, messages: splits)
        writer.writeOptionalMessageField(fieldNumber: 8, message: createTimeStorage)
        writer.writeOptionalMessageField(fieldNumber: 9, message: updateTimeStorage)
        writer.writeEnumField(fieldNumber: 10, rawNumber: splitType.rawValue)
        writer.writeStringField(fieldNumber: 11, value: date)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): title = try reader.readString()
        case (3, .lengthDelimited): payer = try reader.readString()
        case (4, .lengthDelimited): amountStorage = try reader.readMessage()
        case (5, .varint): category = Category(rawValue: try reader.readInt32()) ?? .categoryUnspecified
        case (6, .lengthDelimited): description = try reader.readString()
        case (7, .lengthDelimited): splits.append(try reader.readMessage())
        case (8, .lengthDelimited): createTimeStorage = try reader.readMessage()
        case (9, .lengthDelimited): updateTimeStorage = try reader.readMessage()
        case (10, .varint): splitType = SplitType(rawValue: try reader.readInt32()) ?? .splitTypeUnspecified
        case (11, .lengthDelimited): date = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct TripExpenseSummary: ProtoBinaryMessage {
    public struct Balance: ProtoBinaryMessage {
        public var user: String = ""
        public var userName: String = ""
        public var netBalanceStorage: Money? = nil

        public var netBalance: Money {
            get { netBalanceStorage ?? Money() }
            set { netBalanceStorage = newValue }
        }
        public var hasNetBalance: Bool { netBalanceStorage != nil }

        public init() {}
        public init(user: String = "", userName: String = "", netBalance: Money? = nil) {
            self.user = user
            self.userName = userName
            self.netBalanceStorage = netBalance
        }

        public func encodeToProtoWire(writer: inout ProtoWireWriter) {
            writer.writeStringField(fieldNumber: 1, value: user)
            writer.writeStringField(fieldNumber: 2, value: userName)
            writer.writeOptionalMessageField(fieldNumber: 3, message: netBalanceStorage)
        }

        public mutating func decodeFieldFromProtoWire(
            fieldNumber: Int,
            wireType: ProtoWireType,
            reader: inout ProtoWireReader
        ) throws {
            switch (fieldNumber, wireType) {
            case (1, .lengthDelimited): user = try reader.readString()
            case (2, .lengthDelimited): userName = try reader.readString()
            case (3, .lengthDelimited): netBalanceStorage = try reader.readMessage()
            default: try reader.skipField(wireType: wireType)
            }
        }
    }

    public var name: String = ""
    public var totalSpentStorage: Money? = nil
    public var balances: [Balance] = []

    public var totalSpent: Money {
        get { totalSpentStorage ?? Money() }
        set { totalSpentStorage = newValue }
    }
    public var hasTotalSpent: Bool { totalSpentStorage != nil }
    public var balancesList: [Balance] { balances }
    public var balancesCount: Int { balances.count }

    public init() {}

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeOptionalMessageField(fieldNumber: 2, message: totalSpentStorage)
        writer.writeRepeatedMessageField(fieldNumber: 3, messages: balances)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): totalSpentStorage = try reader.readMessage()
        case (3, .lengthDelimited): balances.append(try reader.readMessage())
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListExpenseTripsRequest: ProtoBinaryMessage {
    public var pageSize: Int32 = 0
    public var pageToken: String = ""
    public var filter: String = ""
    public var orderBy: String = ""

    public init() {}
    public static func getDefaultInstance() -> ListExpenseTripsRequest { ListExpenseTripsRequest() }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: pageSize)
        writer.writeStringField(fieldNumber: 2, value: pageToken)
        writer.writeStringField(fieldNumber: 3, value: filter)
        writer.writeStringField(fieldNumber: 4, value: orderBy)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): pageSize = try reader.readInt32()
        case (2, .lengthDelimited): pageToken = try reader.readString()
        case (3, .lengthDelimited): filter = try reader.readString()
        case (4, .lengthDelimited): orderBy = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListExpenseTripsResponse: ProtoBinaryMessage {
    public var expenseTrips: [ExpenseTrip] = []
    public var nextPageToken: String = ""
    public var totalSize: Int32 = 0

    public var expenseTripsList: [ExpenseTrip] { expenseTrips }
    public var expenseTripsCount: Int { expenseTrips.count }

    public init() {}
    public init(expenseTrips: [ExpenseTrip]) { self.expenseTrips = expenseTrips }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: expenseTrips)
        writer.writeStringField(fieldNumber: 2, value: nextPageToken)
        writer.writeInt32Field(fieldNumber: 3, value: totalSize)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): expenseTrips.append(try reader.readMessage())
        case (2, .lengthDelimited): nextPageToken = try reader.readString()
        case (3, .varint): totalSize = try reader.readInt32()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetExpenseTripRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateExpenseTripRequest: ProtoBinaryMessage {
    public var expenseTripStorage: ExpenseTrip? = nil
    public var expenseTrip: ExpenseTrip {
        get { expenseTripStorage ?? ExpenseTrip() }
        set { expenseTripStorage = newValue }
    }

    public init() {}
    public init(expenseTrip: ExpenseTrip) { self.expenseTripStorage = expenseTrip }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: expenseTripStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            expenseTripStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateExpenseTripRequest: ProtoBinaryMessage {
    public var expenseTripStorage: ExpenseTrip? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var expenseTrip: ExpenseTrip {
        get { expenseTripStorage ?? ExpenseTrip() }
        set { expenseTripStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(expenseTrip: ExpenseTrip, updateMask: ProtoFieldMask? = nil) {
        self.expenseTripStorage = expenseTrip
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: expenseTripStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): expenseTripStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteExpenseTripRequest: ProtoBinaryMessage {
    public var name: String = ""
    public var permanent: Bool = false

    public init() {}
    public init(name: String, permanent: Bool = false) {
        self.name = name
        self.permanent = permanent
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeBoolField(fieldNumber: 2, value: permanent)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited):
            name = try reader.readString()
        case (2, .varint):
            permanent = try reader.readBool()
        default:
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListExpensesRequest: ProtoBinaryMessage {
    public var parent: String = ""
    public var pageSize: Int32 = 0
    public var pageToken: String = ""
    public var filter: String = ""
    public var orderBy: String = ""

    public init() {}
    public init(parent: String) { self.parent = parent }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: parent)
        writer.writeInt32Field(fieldNumber: 2, value: pageSize)
        writer.writeStringField(fieldNumber: 3, value: pageToken)
        writer.writeStringField(fieldNumber: 4, value: filter)
        writer.writeStringField(fieldNumber: 5, value: orderBy)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): parent = try reader.readString()
        case (2, .varint): pageSize = try reader.readInt32()
        case (3, .lengthDelimited): pageToken = try reader.readString()
        case (4, .lengthDelimited): filter = try reader.readString()
        case (5, .lengthDelimited): orderBy = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListExpensesResponse: ProtoBinaryMessage {
    public var expenses: [Expense] = []
    public var nextPageToken: String = ""
    public var totalSize: Int32 = 0

    public var expensesList: [Expense] { expenses }
    public var expensesCount: Int { expenses.count }

    public init() {}
    public init(expenses: [Expense]) { self.expenses = expenses }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: expenses)
        writer.writeStringField(fieldNumber: 2, value: nextPageToken)
        writer.writeInt32Field(fieldNumber: 3, value: totalSize)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): expenses.append(try reader.readMessage())
        case (2, .lengthDelimited): nextPageToken = try reader.readString()
        case (3, .varint): totalSize = try reader.readInt32()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetExpenseRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateExpenseRequest: ProtoBinaryMessage {
    public var parent: String = ""
    public var expenseStorage: Expense? = nil

    public var expense: Expense {
        get { expenseStorage ?? Expense() }
        set { expenseStorage = newValue }
    }

    public init() {}
    public init(parent: String, expense: Expense) {
        self.parent = parent
        self.expenseStorage = expense
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: parent)
        writer.writeOptionalMessageField(fieldNumber: 2, message: expenseStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): parent = try reader.readString()
        case (2, .lengthDelimited): expenseStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateExpenseRequest: ProtoBinaryMessage {
    public var expenseStorage: Expense? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var expense: Expense {
        get { expenseStorage ?? Expense() }
        set { expenseStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(expense: Expense, updateMask: ProtoFieldMask? = nil) {
        self.expenseStorage = expense
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: expenseStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): expenseStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteExpenseRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetTripExpenseSummaryRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

// MARK: - equipment.proto

public struct Equipment: ProtoBinaryMessage, Identifiable {
    public var id: String { name }

    public var name: String = ""
    public var title: String = ""
    public var link: String = ""
    public var price: String = ""
    public var image: String = ""
    public var comments: String = ""
    public var owner: String = ""

    public init() {}

    public init(
        name: String = "",
        title: String = "",
        link: String = "",
        price: String = "",
        image: String = "",
        comments: String = "",
        owner: String = ""
    ) {
        self.name = name
        self.title = title
        self.link = link
        self.price = price
        self.image = image
        self.comments = comments
        self.owner = owner
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
        writer.writeStringField(fieldNumber: 2, value: title)
        writer.writeStringField(fieldNumber: 3, value: link)
        writer.writeStringField(fieldNumber: 4, value: price)
        writer.writeStringField(fieldNumber: 5, value: image)
        writer.writeStringField(fieldNumber: 6, value: comments)
        writer.writeStringField(fieldNumber: 7, value: owner)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): name = try reader.readString()
        case (2, .lengthDelimited): title = try reader.readString()
        case (3, .lengthDelimited): link = try reader.readString()
        case (4, .lengthDelimited): price = try reader.readString()
        case (5, .lengthDelimited): image = try reader.readString()
        case (6, .lengthDelimited): comments = try reader.readString()
        case (7, .lengthDelimited): owner = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListEquipmentRequest: ProtoBinaryMessage {
    public var pageSize: Int32 = 0
    public var pageToken: String = ""

    public init() {}
    public init(pageSize: Int32 = 1000) { self.pageSize = pageSize }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeInt32Field(fieldNumber: 1, value: pageSize)
        writer.writeStringField(fieldNumber: 2, value: pageToken)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .varint): pageSize = try reader.readInt32()
        case (2, .lengthDelimited): pageToken = try reader.readString()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct ListEquipmentResponse: ProtoBinaryMessage {
    public var equipment: [Equipment] = []
    public var nextPageToken: String = ""
    public var totalSize: Int32 = 0

    public var equipmentList: [Equipment] { equipment }
    public var equipmentCount: Int { equipment.count }

    public init() {}
    public init(equipment: [Equipment], totalSize: Int32 = 0) {
        self.equipment = equipment
        self.totalSize = totalSize
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeRepeatedMessageField(fieldNumber: 1, messages: equipment)
        writer.writeStringField(fieldNumber: 2, value: nextPageToken)
        writer.writeInt32Field(fieldNumber: 3, value: totalSize)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): equipment.append(try reader.readMessage())
        case (2, .lengthDelimited): nextPageToken = try reader.readString()
        case (3, .varint): totalSize = try reader.readInt32()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct GetEquipmentRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct CreateEquipmentRequest: ProtoBinaryMessage {
    public var equipmentStorage: Equipment? = nil
    public var equipment: Equipment {
        get { equipmentStorage ?? Equipment() }
        set { equipmentStorage = newValue }
    }

    public init() {}
    public init(equipment: Equipment) { self.equipmentStorage = equipment }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: equipmentStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            equipmentStorage = try reader.readMessage()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}

public struct UpdateEquipmentRequest: ProtoBinaryMessage {
    public var equipmentStorage: Equipment? = nil
    public var updateMaskStorage: ProtoFieldMask? = nil

    public var equipment: Equipment {
        get { equipmentStorage ?? Equipment() }
        set { equipmentStorage = newValue }
    }
    public var updateMask: ProtoFieldMask {
        get { updateMaskStorage ?? ProtoFieldMask() }
        set { updateMaskStorage = newValue }
    }

    public init() {}
    public init(equipment: Equipment, updateMask: ProtoFieldMask? = nil) {
        self.equipmentStorage = equipment
        self.updateMaskStorage = updateMask
    }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeOptionalMessageField(fieldNumber: 1, message: equipmentStorage)
        writer.writeOptionalMessageField(fieldNumber: 2, message: updateMaskStorage)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        switch (fieldNumber, wireType) {
        case (1, .lengthDelimited): equipmentStorage = try reader.readMessage()
        case (2, .lengthDelimited): updateMaskStorage = try reader.readMessage()
        default: try reader.skipField(wireType: wireType)
        }
    }
}

public struct DeleteEquipmentRequest: ProtoBinaryMessage {
    public var name: String = ""

    public init() {}
    public init(name: String) { self.name = name }

    public func encodeToProtoWire(writer: inout ProtoWireWriter) {
        writer.writeStringField(fieldNumber: 1, value: name)
    }

    public mutating func decodeFieldFromProtoWire(
        fieldNumber: Int,
        wireType: ProtoWireType,
        reader: inout ProtoWireReader
    ) throws {
        if fieldNumber == 1 && wireType == .lengthDelimited {
            name = try reader.readString()
        } else {
            try reader.skipField(wireType: wireType)
        }
    }
}
