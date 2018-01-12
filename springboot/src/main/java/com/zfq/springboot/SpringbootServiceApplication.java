package com.zfq.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ComponentScan
@MapperScan("com.zfq.springboot.mapper")
@ImportResource(value = {"classpath:/dubbo/dubbo-provider.xml"}) // 使用 providers.xml 配置；
	public class SpringbootServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceApplication.class, args);
	}
}
