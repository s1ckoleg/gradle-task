/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.2/samples
 */

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.10"

    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.google.guava:guava:30.1.1-jre")

    testImplementation(kotlin("test-junit5"))
}

tasks.test {
    useJUnitPlatform()
}
