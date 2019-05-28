package com.li;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class MsgSend {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;



    @Value("${mq.config.exchange}")
    private String exchange;



    @Value("${mq.config.queue.info.routing.key}")
    private String infoRoutingKey;

    public void sendMsg(String msg) {

        while (true){
            rabbitmqTemplate.convertAndSend(exchange,infoRoutingKey,"info信息");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
