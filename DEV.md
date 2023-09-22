## Frequently used Gradle tasks

### dev (running local)

- `./gradlew demo:jsBrowserRun` (runs `Main.kt`, development)
    - open: `http://127.0.0.1:8080/`
    - `./gradlew demo:jsBrowserDevelopmentRun` - same as `jsBrowserRun`
    - `./gradlew demo:jsBrowserRun --continuous` - reload on code change (dev)

### test, prod

- bundle distributable: `./gradlew demo:jsBrowserDistribution -Pprod=true` (production)
    - see `demo/build/dist/js/productionExecutable/*`
- `./gradlew library:publishJsPublicationToMavenLocalRepository`

### chore

- `./gradlew clean` - delete build dirs (`./build/`, `./web/build/`)
- `./gradlew dependencyUpdates` - check for dependency updates, result will be printed in console
    - `./gradlew showDependencyUpdates` - show generated report in web-browser
        - or `xdg-open build/dependencyUpdates/report.html`
- `./gradlew library:dependencies` - view dependencies hierarchy
    - `./gradlew library:dependencies --configuration jsCompileClasspath`
- `./gradlew demo:dependencies` - view dependencies hierarchy
    - `./gradlew demo:dependencies --configuration jsCompileClasspath`
- `./gradlew kotlinUpgradeYarnLock` - after each dependency update
