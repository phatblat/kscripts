/*
 * build.gradle.kts
 * kscripts
 */

plugins {
//    id("org.jetbrains.kotlin.jvm").version("1.3.11")
    kotlin("jvm").version("1.3.11")
}

repositories {
    jcenter()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.github.fcannizzaro:ksoup:1.0.5")
    implementation("com.github.holgerbrandl:kscript-annotations:1.2")

    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

//java.sourceSets?
sourceSets {
//    main.kotlin.srcDirs += 'src/main/myKotlin'
//    main.java.srcDirs += 'src/main/myJava'
    main {
        java.srcDir("scripts")
        kotlin {
            // ?
        }
    }
}
