package com.li;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接受者
 */

@Component
public class Receiver {



    @RabbitListener(queues = "hello")
    public void  receive(String msg){
        System.out.println("接受到消息 ："+msg);
    }

}
