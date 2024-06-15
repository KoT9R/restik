plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.kushat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    testImplementation(kotlin("test"))
    implementation(project(":bot"))
    implementation(project(":models"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}