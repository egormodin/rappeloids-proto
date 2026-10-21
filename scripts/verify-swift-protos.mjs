import { readFileSync } from 'node:fs';
import { resolve, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const currentDirectory = dirname(fileURLToPath(import.meta.url));
const projectRoot = resolve(currentDirectory, '..');

const swiftProtoPath = resolve(
  projectRoot,
  'swift/Sources/RappeloidsProto/RappeloidsProtos.swift',
);
const swiftSourceContent = readFileSync(swiftProtoPath, 'utf8');

const protoModules = [
  '../dist/gen/rappeloids/v1/common_pb.js',
  '../dist/gen/rappeloids/v1/users_pb.js',
  '../dist/gen/rappeloids/v1/regions_pb.js',
  '../dist/gen/rappeloids/v1/canyons_pb.js',
  '../dist/gen/rappeloids/v1/gpx_pb.js',
  '../dist/gen/rappeloids/v1/history_pb.js',
  '../dist/gen/rappeloids/v1/trips_pb.js',
  '../dist/gen/rappeloids/v1/expenses_pb.js',
  '../dist/gen/rappeloids/v1/equipment_pb.js',
];

const missingMessages = [];

for (const moduleRelativePath of protoModules) {
  const importedModule = await import(moduleRelativePath);
  for (const exportedValue of Object.values(importedModule)) {
    if (
      exportedValue &&
      typeof exportedValue === 'object' &&
      exportedValue.kind === 'message' &&
      typeof exportedValue.name === 'string'
    ) {
      const structDeclaration = `public struct ${exportedValue.name}:`;
      if (!swiftSourceContent.includes(structDeclaration)) {
        missingMessages.push(exportedValue.typeName);
      }
    }
  }
}

if (missingMessages.length > 0) {
  console.error(
    'Missing Swift Protobuf struct definitions in RappeloidsProtos.swift:',
    missingMessages.join(', '),
  );
  process.exit(1);
}

console.log('Verified Swift Protobuf definitions in swift/Sources/RappeloidsProto/RappeloidsProtos.swift');
