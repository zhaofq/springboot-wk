package com.zfq.springboot.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;


import javax.servlet.http.HttpServletRequest;

/**
 * Title: ${file_name}
 * Description: TODO
 * author:zhaofq
 * date: 2017 12 ${date} ${time}
 * version: V1.0
 */
public interface UserService {

    JSONObject registerUser(String userName, String password);

    JSONObject updateUserByInfo(String userName, String password);

}
