
plugins {
    `kotlin-dsl`
}


repositories {
    //gradle插件仓库，这里配置的是官方仓库
    gradlePluginPortal()
}

apply(from = "../properties.gradle.kts")
val springBootVersion:String by project

dependencies {
    //引入springboot插件
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
}
