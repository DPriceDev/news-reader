dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.java.net/content/groups/public/")
        jcenter() // Warning: this repository is going to shut down soon
    }
}
rootProject.name = "NewsReader"
include(":app")
