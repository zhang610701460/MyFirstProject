package com.zyn.java.mapper;

import com.zyn.java.common.ResultMapper;
import com.zyn.java.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 22:55
 */
@Mapper
public interface UserMapper extends ResultMapper<User> {
        @SelectProvider(type = UserProvider.class, method = "selectUser")
        User selectUser(User user);

    }

