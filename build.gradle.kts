plugins {
    kotlin("jvm") version "2.1.0"
}

group = "JMKCC"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0-RC")
    implementation("org.json:json:20231013")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.1.0")
}

kotlin {
    jvmToolchain(21)
}