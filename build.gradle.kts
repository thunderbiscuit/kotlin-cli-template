plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.10"
    id("org.gradle.application")
}

group = "me.tb"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:5.0.3")
    implementation("com.github.ajalt.mordant:mordant:3.0.1")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("me.tb.MainKt")
    applicationName = "ks"
}
