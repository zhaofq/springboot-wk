package com.zfq.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Rabbitmq消息消费启动类
 * @author zhaofq
 */
@SpringBootApplication
@ComponentScan
@ImportResource(value = {"classpath:/dubbo/rabbitmq_listener.xml"}) // 使用 providers.xml 配置；
public class RabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}
}
