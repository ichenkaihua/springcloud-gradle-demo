//定义此插件引用的插件，作为一个springboot项目，必须引用org.springframework.boot插件
plugins {
    java
    id("org.springframework.boot")
}
//定义group
group = "com.chenkh"


configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

//依赖仓库设置，优先从阿里云仓库源获取
repositories {
    repositories{
        maven("https://maven.aliyun.com/repository/public/")
    }
}

dependencies{
    //springboot通用依赖，定义插件版本管理
    //给implementation、developmentOnly、annotationProcessor依赖配置指定依赖版本
    implementation(platform(project(":platform")))
    developmentOnly(platform(project(":platform")))
    annotationProcessor(platform(project(":platform")))
    //自动添加lombok注解
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}



// Enable deprecation messages when compiling Java code
/*tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Xlint:deprecation")
}*/
