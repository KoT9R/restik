plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "restuarant-extension"
include("application")
include("bot")
include("models")
