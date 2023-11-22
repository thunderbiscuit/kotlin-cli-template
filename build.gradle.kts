plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.9.20"
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
                implementation("com.github.ajalt.clikt:clikt:4.2.1")
                implementation("com.github.ajalt.mordant:mordant:2.2.0")
            }
        }
    }
}
