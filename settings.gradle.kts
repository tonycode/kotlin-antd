rootProject.name = "kotlin-antd"


pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.PREFER_PROJECT  // kotlin-js adds "Node Distributions" repo

    repositories {
        // https://mvnrepository.com/ - find repository & artifact version for a given package

        mavenCentral()  // https://repo.maven.apache.org/maven2/
        //maven("https://jitpack.io")

        //mavenLocal()  // ~/.m2/repository
    }
}

// https://docs.gradle.org/current/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")


include(
    "library",
    "demo"
)
