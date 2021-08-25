plugins {
    `java-platform`
}

javaPlatform{
    allowDependencies()
}
// 从上级目录（项目根目录）引入extra变量
apply(from="../properties.gradle.kts")
val springBootVersion:String by project
val springCloudVersion:String by project
val springCloudAlibabaVersion:String by project


dependencies{
    //bom引入，类似maven中的dependencyManagement
    api(platform("org.springframework.boot:spring-boot-dependencies:${springBootVersion}"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"))
    api(platform("com.alibaba.cloud:spring-cloud-alibaba-dependencies:${springCloudAlibabaVersion}"))
    constraints {
        //单个依赖的版本约束
        api("com.baomidou:mybatis-plus-boot-starter:3.4.1")
        api("cn.hutool:hutool-all:5.3.8")
    }

}