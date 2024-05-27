plugins {
    id("java")
}

group = "miu.edu.cse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.run {
    register<JavaExec>("run") {
        mainClass = "miu.edu.cse.Main"
        classpath = sourceSets.main.get().runtimeClasspath
    }
}