## Frequently used Gradle tasks

### dev (running locally)

- **library**
    - `./gradlew library:publishJsPublicationToMavenLocalRepository`
        - `cd ~/.m2/repository/dev/tonycode/kotlin-wrappers/kotlin-antd/`
- **demo**
    - `./gradlew demo:jsBrowserRun` (runs `main.kt`, development)
        - open: `http://127.0.0.1:8080/`
        - `./gradlew demo:jsBrowserDevelopmentRun` - same as `jsBrowserRun`
        - `./gradlew demo:jsBrowserRun --continuous` - reload on code change (dev)

### test, prod

- **library**
    - `./gradlew library:publishJsPublicationToMavenRepository`
        - adjust your credentials in `gradle.properties`
        - `library/build.gradle.kts`: `isRelease = false` for SNAPSHOT
            - https://s01.oss.sonatype.org/content/repositories/snapshots/dev/tonycode/kotlin-wrappers/kotlin-antd/
        - `library/build.gradle.kts`: `isRelease = true` for release build
            - https://repo.maven.apache.org/maven2/dev/tonycode/
- **demo**
    - bundle distributable: `./gradlew demo:jsBrowserDistribution -Pprod=true` (production - no sourcemaps/logs)
        - see `demo/build/dist/js/productionExecutable/*`

### chore

- `./gradlew clean` - delete build dirs (`./build/`, `./library/build/`, `./demo/build/`)
- `./gradlew dependencyUpdates` - check for dependency updates, result will be printed in console
    - `./gradlew showDependencyUpdates` - show generated report in web-browser
        - or `xdg-open build/dependencyUpdates/report.html`
- `./gradlew library:dependencies` - view dependencies hierarchy
    - `./gradlew library:dependencies --configuration jsCompileClasspath`
- `./gradlew demo:dependencies` - view dependencies hierarchy
    - `./gradlew demo:dependencies --configuration jsCompileClasspath`
- `./gradlew kotlinUpgradeYarnLock` - after each dependency update
