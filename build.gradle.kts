
plugins {
    // Android Gradle Plugin
    id("com.android.application") version "8.6.1" apply false

    // Kotlin 2.0.x for Android
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false

    // Kapt for annotation processing (Moshi codegen)
    id("org.jetbrains.kotlin.kapt") version "2.0.21" apply false

    // NEW: required with Kotlin 2.x when using Compose
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.21" apply false
}
