# Proto Update Workflow Rule

Whenever you update or modify any proto definition in the `rappeloids-proto` project:

1. **Increment Semantic Version & Create Release**:
   - Bump the version in `rappeloids-proto/package.json` and `rappeloids-proto/build.gradle.kts` (e.g., `1.2.0` -> `1.3.0`).
   - Build and publish: `npm run build && ./gradlew publishToMavenLocal --no-daemon`.
   - Commit changes, create an annotated git release tag (`git tag -a vX.Y.Z -m "Release vX.Y.Z"`), and push both `main` branch and tag to `origin`.

2. **Update Backend (`rappeloids-backend`)**:
   - Update `implementation("app.rappeloids:rappeloids-proto:X.Y.Z")` in `rappeloids-backend/build.gradle.kts`.
   - Update backend service implementations, repositories, schema, and integration tests to match the new proto schema.
   - Run `./gradlew test --no-daemon` (with `BypassSandbox: true`).
   - Commit and push changes to `origin/main`.

3. **Update Frontend (`rappeloids-frontend`)**:
   - Update `"@egormodin/rappeloids-proto": "^X.Y.Z"` in `rappeloids-frontend/package.json`.
   - Copy compiled TypeScript dist into `rappeloids-frontend/node_modules/@egormodin/rappeloids-proto/dist`.
   - Update stores, models, types, promise client methods, and UI components.
   - Run verification (`npm run build && npm test -- --watch=false`).
   - Commit changes locally (DO NOT push frontend code).
