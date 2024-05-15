@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("multiplatform") version libs.versions.kotlin.get() apply false
    kotlin("plugin.serialization") version libs.versions.kotlin.get() apply false
    id("com.android.library") version libs.versions.android.gradle.plugin.get() apply false
    id("co.touchlab.faktory.kmmbridge") version libs.versions.kmmBridge.get() apply false
    id("com.squareup.sqldelight") version libs.versions.sqlDelight.get() apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    val GROUP = "come.test.kmm"
    val LIBRARY_VERSION = 1.0

    group = GROUP
    version = LIBRARY_VERSION
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
