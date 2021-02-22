package com.example.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@Configuration
public class SwaggerConfig {

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select() /*注册回调*/
                .apis(RequestHandlerSelectors.any())/*配置API的基本包路径。一般接口都配置在controller包里。当然可以根据自己要求配置*/
                .apis(RequestHandlerSelectors.basePackage("com.example.business.controller"))/*配置API的基本包路径。一般接口都配置在controller包里。当然可以根据自己要求配置*/
                .paths(PathSelectors.any())/*接口的路径配置。any就是可以是任意路径*/
                .build();
    }

    /*接口文档的一些基本信息可以自己根据具体配置*/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("restulful API")
                .termsOfServiceUrl("")
                .contact(new Contact("ezparking", "", ""))
                .version("1.0.0")
                .build();
    }

}