buildscript {

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0-alpha09")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${ Version.kotlin }")
        classpath(Dependencies.Hilt.plugin)
        classpath(kotlin(Dependencies.Serialization.plugin, version = Version.kotlin))
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}