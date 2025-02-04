plugins {
    id("java")
}

group = "ganchel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor ("org.projectlombok:lombok:1.18.36")
    testCompileOnly ("org.projectlombok:lombok:1.18.16")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.16")
}

tasks.test {
    useJUnitPlatform()
}