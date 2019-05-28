package com.li;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * rabbitmq direct交换器测试  消息生产者
 */
@SpringBootApplication
public class RabbitMqDirectProviderApplication{

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqDirectProviderApplication.class, args);
    }
}
