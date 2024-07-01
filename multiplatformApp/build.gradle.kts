plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
    kotlin("plugin.serialization") version libs.versions.kotlin.get()
    kotlin("native.cocoapods")
    id("kotlin-parcelize")
}

kotlin {
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    cocoapods {
        version = "1.0"
        ios.deploymentTarget = "14.0"
        summary = "MyWishList"
        homepage = "https://github.com/azartx/"
        podfile = project.file("../iosApp/Podfile")

        framework {
            baseName = "multiplatformApp"
            isStatic = true

            binaryOption("bundleId", "com.solo4.mywishlist")
        }
    }

    // expect/actual classes feature
    compilerOptions {
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    sourceSets {
        androidMain.dependencies {
        }
        commonMain.dependencies {
            implementation(libs.koin.core)

            //common
            implementation(projects.components.common.ui.theme.api)
            implementation(projects.components.common.ui.theme.impl)

            //features
            implementation(projects.components.features.entrypoint.api)
            implementation(projects.components.features.entrypoint.impl)
        }
    }
}

android {
    namespace = "com.solo4.mywishlist"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    /*sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")*/

    defaultConfig {
        applicationId = "com.solo4.mywishlist"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}

tasks.register("testClasses")