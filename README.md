# vfilter
向下兼容的API版本筛选器

Downward compatible API version filter

项目已经上传中央仓库，您可以通过pom引入如下代码

The project has been uploaded to the central warehouse. You can import the following code through POM

```
<dependency>
  <groupId>com.aeert</groupId>
  <artifactId>vfilter</artifactId>
  <version>1.0.0.RELEASE</version>
</dependency>
```

启动类加上组件的路径(com.aeert)扫描即可，路径(com.aeert)需要放在最后面

The path of the startup class plus the component（ com.aeert ）Scan, path（ com.aeert ）It needs to be at the back
```
@SpringBootApplication(scanBasePackages = {"com.example.vfilterdemo", "com.aeert"})
public class VfilterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VfilterDemoApplication.class, args);
    }

}
```

如果你的项目有继承WebMvcConfigurationSupport，需要实现下如下代码

If your project inherits webmvcconfigurationsupport, you need to implement the following code
```
@Configuration
public class WebMvcVfilterConfig extends WebMvcConfigurationSupport {

    @Override
    public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        return handlerMapping;
    }

}
```
