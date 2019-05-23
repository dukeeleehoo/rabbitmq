package com.li.rebbitmqconfig;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {
    /**
     * 启动时生成一个名为hello的队列
     * @return
     */
    @Bean
    public Queue createQueue(){
        return new Queue("hello");
    }

}
