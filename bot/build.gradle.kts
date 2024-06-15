plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.kushat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.telegram:telegrambots-spring-boot-starter:6.9.7.1")
    implementation(project(":models"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}