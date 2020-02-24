plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        implementation("com.google.guava:guava:24.1-jre!!") {
            because("Guava 25.0-jre removed APIs used by Folsom")
        }
    }
    implementation("org.optaplanner:optaplanner-core:7.24.0.Final")
    implementation("com.spotify:folsom:1.5.0")
}
