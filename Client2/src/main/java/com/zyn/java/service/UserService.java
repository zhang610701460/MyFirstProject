package com.zyn.java.service;

import com.zyn.java.entity.User;
import com.zyn.java.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 22:48
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

public  User  selectUser(User user){
    return userMapper.selectOne(user);
}

public int addUser(User user){
   return userMapper.insert(user);
}

public int updateUser(User user){
   return userMapper.updateByPrimaryKey(user);
}

public int deleteUser(Long id){
   return userMapper.deleteByPrimaryKey(id);
    }



}
