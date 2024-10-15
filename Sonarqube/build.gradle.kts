plugins {
  id("org.sonarqube") version "5.1.0.4882"
}

sonar {
  properties {
    property("sonar.projectKey", "Test-SonarQube_TestSonarQ")
    property("sonar.organization", "test-sonarqube-2")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}

group = "org.example"
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
