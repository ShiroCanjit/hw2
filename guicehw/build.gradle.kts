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
    implementation ("com.google.inject:guice:4.0")
    implementation ("org.jetbrains:annotations:13.0")
}
allprojects {
    apply (plugin= "java")
    repositories {
        mavenCentral()
    }

    dependencies {
        implementation ("com.google.inject:guice:4.0")
        implementation ("org.jetbrains:annotations:13.0")
    }
}
