import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin(Plugins.serialization)
    id(Plugins.parcelize)
    id(Plugins.hilt)
}

group = Strings.group
version = Version.version

android {
    compileSdkVersion(Version.compileSdk)
    buildToolsVersion = Version.buildTools

    defaultConfig {
        applicationId = Strings.appId
        minSdkVersion (Version.minSdk)
        targetSdkVersion(Version.targetSdk)
        versionCode = Version.buildCode
        versionName = Version.version

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
        }
        getByName("release") {
            isMinifyEnabled = false
            isDebuggable = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Version.compose
        kotlinCompilerVersion = Version.kotlin
    }
}

dependencies {
    implementation(Dependencies.Kotlin.stdlib)

    implementation(Dependencies.Coroutines.core)

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Android.lifecycleRuntimeKtx)
    implementation(Dependencies.Compose.activity)

    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.appCompat)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Android.constraintLayout)
    implementation(Dependencies.Android.fragmentKtx)
    implementation(Dependencies.Android.activityKtx)
    implementation(Dependencies.Android.viewModelLifecycleKtx)
    implementation(Dependencies.Serialization.json)

    implementation(Dependencies.Room.runtime)
    implementation(Dependencies.Room.ktx)
    kapt(Dependencies.Room.compiler)

    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.moshi)
    implementation(Dependencies.OkHttp.okhttp)

    implementation(Dependencies.Timber.timber)

    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

    implementation(Dependencies.Navigation.fragmentKtx)
    implementation(Dependencies.Navigation.uiKtx)

    implementation(Dependencies.Moshi.moshi)

    testImplementation(Dependencies.Test.junit4)

    androidTestImplementation(Dependencies.AndroidTest.junit)
    androidTestImplementation(Dependencies.AndroidTest.espressoCore)
    androidTestImplementation(Dependencies.Navigation.AndroidTest.testing)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}