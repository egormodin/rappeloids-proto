// swift-tools-version: 5.7
import PackageDescription

let package = Package(
    name: "RappeloidsProto",
    platforms: [
        .iOS(.v16),
        .macOS(.v13)
    ],
    products: [
        .library(
            name: "RappeloidsProto",
            targets: ["RappeloidsProto"]
        )
    ],
    targets: [
        .target(
            name: "RappeloidsProto",
            path: "swift/Sources/RappeloidsProto"
        )
    ]
)
