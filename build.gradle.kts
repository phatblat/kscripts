/*
 * build.gradle.kts
 * kscripts
 */

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.11")
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

//sourceSets.main.
