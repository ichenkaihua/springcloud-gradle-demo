//定义此插件引用的插件，作为一个springboot项目，必须引用org.springframework.boot插件
plugins {
    id("shopping.springboot-nacos-conventions")
}







dependencies{
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("com.alibaba.cloud:spring-cloud-starter-alibaba-sentinel")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")

}



