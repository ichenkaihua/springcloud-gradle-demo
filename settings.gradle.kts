pluginManagement{
    // springBootVersion值会委托到settings对象，最终拿到的是properties.gradle.kts中的值
    apply(from="properties.gradle.kts")
    val springBootVersion: String by settings
    plugins{
        id("org.springframework.boot") version springBootVersion
    }
}
include("common")
include("order")
include("product")
include("user")
include("platform")
rootProject.name="shopping"