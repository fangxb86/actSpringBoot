package com.gwd.controller;

import com.gwd.entity.User;
import com.gwd.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("登录请求")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询用户列表")
    @GetMapping("/user/findAll")
    public List<User> findUserList(){
        return userService.findUserList();
    }

    @ApiOperation("查询单个用户")
    @GetMapping("/user/findOne/{id}")
    public User findUserList(@PathVariable(name = "id")Long userId){
        return userService.findOneUserById(userId);
    }
}
