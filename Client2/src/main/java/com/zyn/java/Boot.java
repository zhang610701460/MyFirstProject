package com.zyn.java;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 启动类
 * @author zhanglu
 * @date 2017/6/3 12:42
 */
@SpringBootApplication
@EnableEurekaClient // 启动EnableEureka客户端
@RestController
public class Boot {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }

    @GetMapping("/hi")
    public String say(@RequestParam("name") String name){
        return "hello"+name ;
    }
}
