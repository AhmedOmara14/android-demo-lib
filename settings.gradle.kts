pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url=uri("https://jitpack.io") } // add like this
        mavenLocal()
        jcenter()

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url=uri("https://jitpack.io") } // add like this
        mavenLocal()
        jcenter()

    }
}
rootProject.name = "libs_test"
include(":app")
include(":TestSdk")
