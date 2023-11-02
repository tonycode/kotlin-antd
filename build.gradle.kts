import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension


plugins {
    `kotlin-dsl`
    alias(libs.plugins.gradle.versions)
}


plugins.withType<YarnPlugin> {
    the<YarnRootExtension>().apply {
        version = "1.22.19"  // https://www.npmjs.com/package/yarn
        lockFileDirectory = projectDir
        yarnLockMismatchReport = YarnLockMismatchReport.NONE
        ignoreScripts = false  // WA from https://youtrack.jetbrains.com/issue/KT-52578
    }
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        nodeVersion = "18.17.1"  // https://nodejs.org/en - LTS
    }
}


//region tasks
/* generate gradle-wrapper with `gradle wrapper` */
tasks.wrapper {
    gradleVersion = "8.4"
    distributionType = Wrapper.DistributionType.ALL
}

fun String.isStable(): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { this.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    return (stableKeyword || regex.matches(this))
}

fun String.isNonStable(): Boolean = isStable().not()

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        candidate.version.isNonStable() && currentVersion.isStable()
    }

    checkForGradleUpdate = true
    outputFormatter = "html"  // https://github.com/ben-manes/gradle-versions-plugin#report-format
    outputDir = "build/dependencyUpdates"
    reportfileName = "report"
}

tasks.register("showDependencyUpdates") {
    dependsOn("dependencyUpdates")
    doLast {
        exec {
            commandLine(
                "xdg-open",
                "build/dependencyUpdates/report.html"
            )
        }
    }
}
//endregion
