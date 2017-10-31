package com.zyn.java.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/29 0029 19:31
 */
@FeignClient("Client2")
public interface TestClient{
    @GetMapping("/hi")
    String say(@RequestParam("name") String name);
}
