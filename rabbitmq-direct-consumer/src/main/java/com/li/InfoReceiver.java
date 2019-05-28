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
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange.directname}",type = ExchangeTypes.DIRECT),
                key="${mq.config.queue.info.routing.key}"
        )
)
public class InfoReceiver {



   @RabbitHandler
    public void  receive(String msg){
        System.out.println("info ............................接受到消息 ："+msg);
    }

}
