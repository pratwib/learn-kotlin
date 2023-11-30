import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    testImplementation("org.mockito:mockito-junit-jupiter:4.9.0")
}

tasks.named<Test>("test") {
    useJUnitPlatform {
        excludeTags("integration-test")
    }
}

tasks.register("integration-test", Test::class) {
    useJUnitPlatform {
        includeTags("integration-test")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}