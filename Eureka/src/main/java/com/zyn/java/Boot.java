package com.zyn.java;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description 启动类
 * @author zhanglu
 * @date 2017/6/3 12:42
 */
@SpringBootApplication
@EnableEurekaServer // 开启Eureka Server
public class Boot {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }
}
