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
        moduleName = project.name
        browser()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                api(libs.kotlinw.react)
                api(libs.kotlinw.react.dom)

                implementation(npm("antd", libs.versions.antd.get()))
            }
        }
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        sourceMap = false
        moduleKind = moduleDefinition
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
        name.set(rootProject.name)
        description.set(
            "Kotlin wrapper for Ant Design (React UI library \"antd\", https://ant.design/docs/react/introduce)"
        )
        url.set("https://github.com/tonycode/kotlin-antd")

        licenses {
            license {
                name.set("MIT License")
                url.set("https://github.com/tonycode/kotlin-antd/blob/main/LICENSE")
            }
        }

        developers {
            developer {
                id.set("tonycode")
                name.set("Anton Vasilev")
                email.set("opensource@tonycode.dev")
                organization.set("tonycode")
                organizationUrl.set("https://tonycode.dev/")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/tonycode/kotlin-antd.git")
            developerConnection.set("scm:git:git@github.com:tonycode/kotlin-antd.git")
            url.set("https://github.com/tonycode/kotlin-antd")
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
