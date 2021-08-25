//定义此插件引用的插件，作为一个springboot项目，必须引用org.springframework.boot插件
plugins {
    id("shopping.springboot-conventions")
}







dependencies{
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-discovery")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-nacos-config")
}



