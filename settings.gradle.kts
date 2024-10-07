

pluginManagement {

    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()


    }
}
dependencyResolutionManagement {
    val storageUrl = "https://storage.googleapis.com"
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "/Users/shidqiakram/StudioProjects/flutter_container/build/host/outputs/repo")
        maven(url = "$storageUrl/download.flutter.io")
    }
}

rootProject.name = "ParentApp"
include(":app")
 