package com.zyn.java.controller;

import com.zyn.java.entity.User;
import com.zyn.java.service.UserService;
import com.zyn.java.util.JsonTools;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyanan
 * @description
 * @date 2017/10/30 0030 23:17
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "查询用户信息", notes = "根据条件查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "账号", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String", paramType = "query")})
    @ApiResponses({ @ApiResponse(code = 200, message = "请求成功", response = User.class) })
    @GetMapping("/user")
    public User selectUser(@RequestParam(value = "username") String username,@RequestParam(value = "password") String password){
        User user = new User().setPassword(password).setUsername(username);
        log.info("getUser receive params:[user json is:{}]", JsonTools.toJSONString(user));
        return userService.selectUser(user);
    }

    @ApiOperation(value = "添加用户", notes = "添加一条用户")
    @ApiResponses({ @ApiResponse(code = 200, message = "请求成功") })
    @PutMapping("/user/add")
    public void insertUser(@RequestBody User user){
        log.info("addUser receive params:[user json is:{}]", JsonTools.toJSONString(user));
        userService.addUser(user);
    }

    @ApiOperation(value = "修改用户", notes = "修改用户信息")
    @ApiResponses({ @ApiResponse(code = 200, message = "请求成功") })
    @PostMapping("/user/update")
    public void updateUser(@RequestBody User user){
        log.info("updateUser receive params:[user json is:{}]", JsonTools.toJSONString(user));
        userService.updateUser(user);
    }

    @ApiOperation(value = "删除用户", notes = "根据条件删除用户信息")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "主键", required = true, dataType = "Long", paramType = "query") })
        @ApiResponses({ @ApiResponse(code = 200, message = "请求成功") })
        @DeleteMapping("/user/delete")
        public void deleteUser(@RequestParam("id") Long id){
        log.info("deleteUser receive params:[id:{}]", id);
        userService.deleteUser(id);
    }

}
