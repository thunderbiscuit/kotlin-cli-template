plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "me.tb"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:4.2.1")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("me.tb.MainKt")
    applicationName = "templatecliapp"
}
