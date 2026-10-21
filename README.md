# Rappeloids Protos (`@rappeloids/proto`)

Canonical Google AIP / Protocol Buffer definitions for the Rappeloids ecosystem (Backend, Web Frontend, iOS, Android).

## 📁 Repository Structure
```text
rappeloids-proto/
 ├── proto/
 │    ├── buf.yaml
 │    └── rappeloids/
 │         └── v1/
 │              ├── common.proto
 │              ├── canyons.proto
 │              ├── regions.proto
 │              ├── trips.proto
 │              ├── expenses.proto
 │              └── users.proto
 ├── src/
 │    └── index.ts
 ├── swift/
 │    └── Sources/
 │         └── RappeloidsProto/
 │              ├── ProtoWireCodec.swift
 │              └── RappeloidsProtos.swift
 ├── Package.swift
 ├── package.json
 └── buf.gen.yaml
```

## 🚀 Usage in iOS (`rappeloids-ios`)
Add the Swift Package dependency in `Package.swift` or Xcode (`project.yml`):
```swift
dependencies: [
    .package(url: "https://github.com/egormodin/rappeloids-proto.git", from: "1.6.3")
]
```
Import the shared Protobuf models and binary wire codec directly:
```swift
import RappeloidsProto
```

## 🚀 Usage in Frontend (`rappeloids-frontend`)
Install the shared TypeScript package:
```bash
npm install @rappeloids/proto
```

Import strongly-typed Protobuf models and service definitions directly:
```typescript
import { Canyon, ListCanyonsRequest, ListCanyonsResponse } from '@rappeloids/proto';

const request: ListCanyonsRequest = {
  pageSize: 50,
  pageToken: '',
  filter: 'rating >= 4.0'
};
```

## 🛠️ Local Development
To regenerate TypeScript code locally after changing `.proto` files:
```bash
npm run build
```
