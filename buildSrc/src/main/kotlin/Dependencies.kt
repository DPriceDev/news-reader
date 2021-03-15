
object Dependencies {

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${ Version.hilt }"
        const val compiler = "com.google.dagger:hilt-android-compiler:${ Version.hilt }"
        const val plugin = "com.google.dagger:hilt-android-gradle-plugin:${ Version.hilt }"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${ Version.kotlin }"
    }

    object Serialization {
        const val plugin = "serialization"
        const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${ Version.serialization }"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${ Version.coroutine }"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${ Version.compose }"
        const val material = "androidx.compose.material:material:${ Version.compose }"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${ Version.compose }"

        const val activity = "androidx.activity:activity-compose:1.3.0-alpha02"
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val material = "com.google.android.material:material:1.2.1"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:${ Version.fragment }"
        const val activityKtx = "androidx.activity:activity-ktx:${ Version.activity }"
        const val viewModelLifecycleKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.0"
    }

    object Navigation {
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${ Version.navigation }"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:${ Version.navigation }"
        const val navArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${ Version.navigation }"

        object AndroidTest {
            const val testing = "androidx.navigation:navigation-testing:${ Version.navigation }"
        }
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${ Version.retrofit }"
        const val moshi = "com.squareup.retrofit2:converter-moshi:${ Version.retrofit }"
    }

    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:${ Version.okHttp }"
    }

    object Moshi {
        const val moshi = "com.squareup.moshi:moshi-kotlin:${ Version.moshi }"
    }

    object Timber {
        const val timber = "com.jakewharton.timber:timber:${ Version.timber }"
    }

    object Test {
        const val junit4 = "junit:junit:4.+"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${ Version.room }"
        const val compiler = "androidx.room:room-compiler:${ Version.room }"
        const val ktx = "androidx.room:room-ktx:${ Version.room }"

        object Test {
            const val roomTest = "androidx.room:room-testing:${ Version.room }"
        }
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:1.1.2"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
    }
}