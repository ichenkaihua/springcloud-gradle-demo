//作为一个library，
plugins {
    `java-library`
}

// Projects have the 'com.example' group by convention
group = "com.chenkh"

repositories {
    repositories{
        maven("https://maven.aliyun.com/repository/public/")
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies{
    //springboot通用依赖，定义插件版本管理
    implementation(platform(project(":platform")))
   // developmentOnly(platform(project(":platform")))
    annotationProcessor(platform(project(":platform")))
    //自动添加lombok注解
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}
