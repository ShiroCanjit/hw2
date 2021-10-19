plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
tasks.register<JavaExec>("startMainClass") {
    group = "launch"

    mainClass.set( "guice.hw.Main")

    classpath = sourceSets["main"].runtimeClasspath
}