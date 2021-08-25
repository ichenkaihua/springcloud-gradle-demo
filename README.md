
## 说明

网上搭建微服务的教程多是使用maven构建工具，鲜有使用gradle构建的，其实无论从功能、性能、生态圈来看，gradle都比maven强大。

这个demo项目使用了gradle的platform特性，可以像`maven`的`dependencyManagement`一样统一管理依赖版本。

同时gradle的`buildSrc`功能，能够把相同构建逻辑放在一块，当作一个gradle插件，项目只需要引用这个插件就可以引入相同的构建逻辑。非常方便。




