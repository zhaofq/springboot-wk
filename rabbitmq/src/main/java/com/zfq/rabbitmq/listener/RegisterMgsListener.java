package com.zfq.rabbitmq.listener;

/**
 * Title: ${file_name}
 * Description: TODO
 * author:zhaofq
 * date: 2017 12 ${date} ${time}
 * version: V1.0
 */

import com.alibaba.fastjson.JSONObject;
import com.zfq.springboot.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息队列接收类
 */
@Component
@RabbitListener(queues = "registerMSg")
public class RegisterMgsListener {


    @Autowired
    private  UserService userService;

    @RabbitHandler
    public void process(String content) {
        System.out.println("Receiver------ : " + content);
        String userName="ddd";
        String cc = "vvv";
        System.out.println("--------------");
        JSONObject jsonObject= userService.updateUserByInfo(userName,cc);
        System.out.println("------------000000000000-----"+jsonObject);

    }
}
