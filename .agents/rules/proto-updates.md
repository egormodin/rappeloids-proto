# Proto Update Workflow Rule

Whenever you update or modify any proto definition in the `rappeloids-proto` project:
1. **Automatically update dependent projects**:
   - **Backend (`rappeloids-backend`)**: Publish the new proto version to MavenLocal, update backend service implementations, repositories, schema, and tests to match the new proto schema.
   - **Frontend (`rappeloids-frontend`)**: Build the TypeScript bindings (`@egormodin/rappeloids-proto`), sync them into `rappeloids-frontend`, and adapt store models, types, promise client methods, and UI components.
2. **Execute Full Verification**:
   - Run backend tests (`./gradlew test --no-daemon` with `BypassSandbox: true`).
   - Run frontend build and tests (`npm run build && npm test -- --watch=false`).
