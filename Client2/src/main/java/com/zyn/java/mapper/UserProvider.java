package com.zyn.java.mapper;

import com.zyn.java.entity.User;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 23:01
 */
public class UserProvider {

    public String selectUser(User user){

        StringBuilder sb = new StringBuilder();
        sb.append("select * from where 1=1");
        sb.append("and account= #{account}");
        sb.append("and password= #{password}");

        return sb.toString();

    }

}
