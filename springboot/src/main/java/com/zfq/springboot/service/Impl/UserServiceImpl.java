package com.zfq.springboot.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.zfq.springboot.mapper.UserMapper;
import com.zfq.springboot.pojo.User;
import com.zfq.springboot.service.UserService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Title: ${file_name}
 * Description: TODO
 * author:zhaofq
 * date: 2017 12 ${date} ${time}
 * version: V1.0
 */
public class UserServiceImpl implements UserService {


    private static Logger loger = Logger.getLogger(UserServiceImpl.class.getName());
	@Autowired
	UserMapper userMapper;
	@Autowired
    AmqpTemplate rabbitTemplate;



	public JSONObject registerUser(String userName,String password) {
		byte c=123;
		float x= -222;
		double d=0x12345678;
        JSONObject jsonObject = new JSONObject();
		User user = new User();
		user.setName("zhaofq");
		user.setPassword(password);
		int i = userMapper.addUser(user);

		if (i > 0){
			jsonObject.put("code",200);
			jsonObject.put("msg","注册成功");
			this.rabbitTemplate.convertAndSend("registerMSg",jsonObject.toString());
		}else {
			jsonObject.put("code",201);
			jsonObject.put("msg","注册失败");
		}
		return jsonObject;
	}

	@Override
	public JSONObject updateUserByInfo(String userName, String password) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("res","通知到了");
		return jsonObject;
	}
}
