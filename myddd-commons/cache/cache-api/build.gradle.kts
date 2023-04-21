plugins {
    `java-library`
    idea
}

group = "org.myddd.commons.cache"
version = rootProject.extra["projectVersion"]!!

extra["publishJar"] = true


dependencies {
    testImplementation(project(":myddd-commons:cache:cache-redis"))
}

sonar {
    isSkipProject = true
}