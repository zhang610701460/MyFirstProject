package com.zyn.java;



import com.zyn.java.client.TestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
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
@EnableFeignClients
public class Boot {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Boot.class, args);
    }

    private Logger logger = LoggerFactory.getLogger(Boot.class);

    @Autowired
    private TestClient  testClient;

    @GetMapping("/test")
    public  String test(@RequestParam("name") String name){
        logger.info("------this param is------"+name);
        return testClient.say(name);
    }
}
