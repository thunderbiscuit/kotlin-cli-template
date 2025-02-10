plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.1.10"
}

group = "me.tb"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    // macOS M1 target configuration
    macosArm64 {
        binaries {
            executable {
                entryPoint = "me.tb.main"
                baseName = "ks"
            }
        }
    }

    // linux x86_64 target configuration
    linuxX64 {
        binaries {
            executable {
                entryPoint = "me.tb.main"
                baseName = "ks"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.github.ajalt.clikt:clikt:5.0.3")
                implementation("com.github.ajalt.mordant:mordant:3.0.1")
            }
        }
    }
}
