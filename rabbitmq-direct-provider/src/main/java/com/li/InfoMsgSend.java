package com.li;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 */
@Component
public class InfoMsgSend {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @Value("${mq.config.exchange.directname}")
    private String exchangeName;


    @Value("${mq.config.queue.info.routing.key}")
    private String infoRoutingKey;

    public void sendMsg(String msg) {

        while (true){
            rabbitmqTemplate.convertAndSend(exchangeName, infoRoutingKey, msg);
            rabbitmqTemplate.convertAndSend(exchangeName, "log.info.routing.key", "error");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
