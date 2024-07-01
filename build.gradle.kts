plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    kotlin("native.cocoapods") version libs.versions.kotlin.get() apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}