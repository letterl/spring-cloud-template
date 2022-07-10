import org.springframework.boot.gradle.plugin.SpringBootPlugin
plugins {
    id("org.springframework.boot").version("2.7.1")
    id("io.spring.dependency-management").version("1.0.11.RELEASE")
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"




dependencies{
//    implementation(platform(SpringBootPlugin.BOM_COORDINATES))
//    implementation(libs.spring.cloud.starter.gateway)
//    implementation(libs.spring.boot.starter.web)
//    implementation(libs.guava)
//    implementation(libs.springboot)
//    implementation(platform(libs.cloudAlibaba))


    implementation(platform(libs.springBootDependencies))
    implementation(platform(libs.cloudAlibabaDependencies))
    implementation(platform(libs.springCloudDependencies))

    implementation(libs.spring.boot.configuration.processor)
    implementation(libs.spring.cloud.starter.alibaba.nacos.discovery)
    implementation(libs.spring.cloud.starter.alibaba.nacos.config)
    implementation(libs.spring.cloud.starter.gateway)
//
//    implementation(libs.springCloud)
//    implementation(libs.cloudAlibaba)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}


//tasks.getByName<Test>("test") {
//    useJUnitPlatform()
//}