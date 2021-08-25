plugins {
    //引入buildSrc下自定义的shopping.library-conventions插件
    //这个插件会配置仓库，配置依赖版本
    id("shopping.library-conventions")
}

dependencies{
    //由于shopping.library-conventions插件引用了platform项目，platform项目里已经定义了hutool依赖的版本
    //所以这里不需要写依赖版本
    //common作为一个通用包，可以暴露hutool包接口给引用此项目的项目
    api("cn.hutool:hutool-all")
}