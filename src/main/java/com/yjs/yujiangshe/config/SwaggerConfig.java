package com.yjs.yujiangshe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Desc Swagger配置类
 * @Author ChenFei
 * @Date 2020/7/22 10:13
 */

@Component
// 开启Swagger2的自动配置
@EnableSwagger2
public class SwaggerConfig {
    // 配置docket以配置Swagger具体参数
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.yjs.yujiangshe.controller"))
                .build();  //配置包扫描路径
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("陈", "http://xxx.xxx.com/联系人访问链接", "18583241813@163.com");
        // public ApiInfo(String title, String description, String version, String termsOfServiceUrl, Contact contact, String ", String licenseUrl, Collection<VendorExtension> vendorExtensions) 方法中的需要传入的参数
        return new ApiInfo("Swagger_语匠社小程序后台文档", // 标题
            "语匠社", // 描述
            "v1.0", // 版本
            "http://terms.service.url/组织链接", // 组织链接
            contact, // 联系人信息
            "Apach 2.0 许可", // 许可
            "许可链接", // 许可连接
            new ArrayList<>()); // 扩展
    }
}
