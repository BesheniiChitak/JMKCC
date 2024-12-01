plugins {
    kotlin("jvm") version "2.0.21"
}

group = "jmkc"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("org.json:json:20231013")
}

kotlin {
    jvmToolchain(21)
}