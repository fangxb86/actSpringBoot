package com.gwd.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("登录请求")
public class LoginController {

    @ApiOperation("获取用户登录名字")
    @GetMapping("/login/name")
    public String getUserName(){
        //获取登录的用户名
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}