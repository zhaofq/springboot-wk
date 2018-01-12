package com.zfq.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Title: ${file_name}
 * Description: TODO
 * author:zhaofq
 * date: 2017 12 ${date} ${time}
 * version: V1.0
 */
public class DemoRabbitMqSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String content) {
        System.out.println("Sender : " + content);
        this.rabbitTemplate.convertAndSend("hello", content);
    }
}
