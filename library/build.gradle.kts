import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile


plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)  // Adds support for Kotlin/JS

    `maven-publish`
    signing
}


val projectGroup = "dev.tonycode.kotlin-wrappers"
val projectArtifact = "kotlin-antd"
val projectPackage = "$projectGroup.$projectArtifact"
val projectVersion = "0.1.0-SNAPSHOT"
val buildNumber = "0"
val isRelease = false  // release library build (for Maven Central publication)

group = projectGroup
version = projectVersion

kotlin {
    js {
        moduleName = projectArtifact  // used for: package.json
        browser()

        compilations {
            val main by getting
            main.apply {
                kotlinOptions {
                    // used for: klib/manifest/unique_name
                    freeCompilerArgs += "-Xir-module-name=$projectGroup:$projectArtifact"
                }
            }
        }
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                api(platform(libs.kotlin.bom.get()))  // Align versions of all Kotlin components
                api(libs.kotlin.stdlib)  // Use the Kotlin standard library

                api(platform(libs.kotlin.wrappers.bom.get()))
                api(libs.kotlinw.react)
                api(libs.kotlinw.react.dom)

                implementation(npm("antd", libs.versions.antd.get()))
            }
        }
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        moduleName = projectArtifact
        moduleKind = moduleDefinition
        sourceMap = false
    }
}

val moduleDefinition = if (findProperty("modular") == "true") "commonjs" else "umd"


//region publication
val ossrhUsername: String? by project
val ossrhPassword: String? by project

tasks.withType<Sign>().configureEach {
    onlyIf { isRelease }
}

publishing {
    repositories {
        maven {
            val snapshotRepositoryUrl: String by project
            val releaseRepositoryUrl: String by project
            val repositoryUrl = if (isRelease) releaseRepositoryUrl else snapshotRepositoryUrl

            url = uri(repositoryUrl)

            credentials {
                username = ossrhUsername.orEmpty()
                password = ossrhPassword.orEmpty()
            }
        }
        mavenLocal()  // for debugging purposes
    }

    publications {
        withType<MavenPublication>().configureEach {
            groupId = projectGroup
            artifactId = projectArtifact
            version = projectVersion

            configurePom()
        }
    }
}


fun MavenPublication.configurePom() {
    pom {
        name = rootProject.name
        description =
            "Kotlin wrapper for Ant Design (React UI library \"antd\", https://ant.design/docs/react/introduce)"
        url = "https://github.com/tonycode/kotlin-antd"

        licenses {
            license {
                name = "MIT License"
                url = "https://github.com/tonycode/kotlin-antd/blob/main/LICENSE"
            }
        }

        developers {
            developer {
                id = "tonycode"
                name = "Anton Vasilev"
                email = "opensource@tonycode.dev"
                organization = "tonycode"
                organizationUrl = "https://tonycode.dev/"
            }
        }

        scm {
            connection = "scm:git:git://github.com/tonycode/kotlin-antd.git"
            developerConnection = "scm:git:git@github.com:tonycode/kotlin-antd.git"
            url = "https://github.com/tonycode/kotlin-antd"
        }
    }
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications)
}
//endregion
