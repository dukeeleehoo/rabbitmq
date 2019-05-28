package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *Rabbitmq  交换器测试
 * dirct交换器  消息消费者
 *
 */



@SpringBootApplication
public class RabbitMqDirectConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(RabbitMqDirectConsumerApplication.class, args);
    }
}
