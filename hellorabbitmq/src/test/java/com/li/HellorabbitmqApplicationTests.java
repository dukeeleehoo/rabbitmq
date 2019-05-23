package com.li;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HellorabbitmqApplication.class)
public class HellorabbitmqApplicationTests {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;
    /**
     * 测试rqbbitmq链接生产数据
     */
    @Test
    public void testProvider() {

        int i =0;
        while (true) {
            //连接名为hello的消息队列
            rabbitmqTemplate.convertAndSend("hello",i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("生产数据：" + i);
            i++;

        }


    }

}
