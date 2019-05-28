package com.li;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 消息接受者
 */

@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.error}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange.directname}",type = ExchangeTypes.DIRECT),
                key="${mq.config.queue.error.routing.key}"
        )
)
public class ErrorReceiver {



   @RabbitHandler
    public void  receive(String msg){
        System.out.println("error .................接受到消息 ："+msg);
    }

}
