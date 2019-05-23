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

    public void sendMsg(String msg) {

        while (true){
            rabbitmqTemplate.convertAndSend("hello",msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
