plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

tasks {
    processResources {
        filesMatching("**/plugin.yml") {
            expand(
                "version" to project.version,
                "description" to project.description,
                "url" to "https://github.com/xGinko/ServerRestarts"
            )
        }
        filesMatching("**/velocity-plugin.json") {
            expand(
                "version" to project.version,
                "description" to project.description,
                "url" to "https://github.com/xGinko/ServerRestarts"
            )
        }
    }
}
