package com.li;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class MsgSend {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public String sendMsg(String msg){
        rabbitmqTemplate.convertAndSend("hello",msg);
        return msg;
    }


}
