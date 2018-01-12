package com.zfq.springboot.controller;


import com.alibaba.fastjson.JSONObject;

import com.zfq.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Title: ${file_name}
 * Description: TODO
 * author:zhaofq
 * date: 2017 12 ${date} ${time}
 * version: V1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {



    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser")
    public JSONObject addUser(HttpServletRequest request){
        String userName = "zhaofq";
        String password = "1234";
        return  userService.registerUser(userName, password);
    }
}
