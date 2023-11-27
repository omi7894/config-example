package com.hae.configexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.List;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket approvalApi(List<RequestParameter> globalRequestParams) {
        return new Docket(DocumentationType.OAS_30)
                .globalRequestParameters(globalRequestParams)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hae.configexample.controller.v1"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .groupName("authority")
                .pathMapping("/");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("현대오토에버 차세대 결재시스템 - Configuration API")
                .description("Configuration API Document")
                .version("1.0")
                .contact(new Contact("e-mail", "", "omi7894@hyundai-autoever.com"))
                .build();
    }
}