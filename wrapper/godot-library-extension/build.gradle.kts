import java.util.*

val bintrayUser: String by project
val bintrayKey: String by project
val platform: String by project

plugins {
    id("kotlin-multiplatform")
    id("maven-publish")
    id("com.jfrog.bintray")
}

group = "org.godotengine.kotlin"
version = "1.0.0"

kotlin {
    sourceSets {
        sourceSets.create("macosMain")
        sourceSets.create("linuxMain")
        sourceSets.create("windowsMain")
        configure(listOf(sourceSets["macosMain"], sourceSets["linuxMain"], sourceSets["windowsMain"])) {
            this.kotlin.srcDir("src/main/kotlin")
        }
    }

    val target =
            if (project.hasProperty("platform")) {
                when (platform) {
                    "windows" -> targetFromPreset(presets["mingwX64"], "windows")
                    "linux" -> targetFromPreset(presets["linuxX64"], "linux")
                    "macos" -> targetFromPreset(presets["macosX64"], "macos")
                    else -> targetFromPreset(presets["linuxX64"], "linux")
                }
            } else targetFromPreset(presets["linuxX64"], "linux")

    target.compilations.all {
        dependencies {
            implementation(project(":wrapper:godot-library"))
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:1.3.3")
        }
    }
}

tasks.build {
    finalizedBy(tasks.publishToMavenLocal)
}

if(project.hasProperty("bintrayUser") && project.hasProperty("bintrayKey")
        && project.hasProperty("platform")) {
    bintray {
        user = bintrayUser
        key = bintrayKey
        setPublications(platform)
        pkg(delegateClosureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
            userOrg = "utopia-rise"
            repo = "kotlin-godot"

            name = "${project.name}-$platform"
            vcsUrl = "https://github.com/utopia-rise/kotlin-godot-wrapper"
            setLicenses("Apache-2.0")
            version(closureOf<com.jfrog.bintray.gradle.BintrayExtension.VersionConfig> {
                this.name = project.version.toString()
                released = Date().toString()
                description = "Godot library extension ${project.version}"
                vcsTag = project.version.toString()
            })
        })
    }
}