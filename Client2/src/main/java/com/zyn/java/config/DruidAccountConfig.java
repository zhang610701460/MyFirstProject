package com.zyn.java.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @description
 *
 * @author zhanglu
 * @date 2017/6/5 20:45
 */
@ConfigurationProperties(prefix = "druid.account")
@Component
public class DruidAccountConfig {

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
