plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testCompile("junit", "junit", "4.12")
    implementation("com.google.code.gson:gson:2.8.6")
}
