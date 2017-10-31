package com.zyn.java.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ConfigurationProperties(prefix = "swagger")
public class SwaggerConfig {
    @Setter
    @Getter
    private boolean enable;

    @Bean
    public Docket createRestApi(){
        return  new Docket(DocumentationType.SWAGGER_2)
            .enable(enable)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
            .paths(PathSelectors.any())
            .build();
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
            .title("Zyn")
            .description("zynTest")
            .termsOfServiceUrl("localhost:48082")
            .version("1.0")
            .build();
    }
}
