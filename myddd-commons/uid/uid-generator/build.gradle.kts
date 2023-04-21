plugins {
    `java-library`
    id("idea")
}

group = "org.myddd.commons"
version = rootProject.extra["projectVersion"]!!
extra["publishJar"] = true

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:${rootProject.extra["spring.boot"]}")
    implementation("commons-collections:commons-collections:3.2.2")
    implementation("commons-lang:commons-lang:2.6")
}


sonar {
    isSkipProject = true
}