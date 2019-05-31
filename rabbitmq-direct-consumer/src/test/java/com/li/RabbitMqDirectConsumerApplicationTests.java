package com.li;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqDirectConsumerApplication.class)
public class RabbitMqDirectConsumerApplicationTests {


    @Autowired
    InfoReceiver infoReceiver;


    /**
     * 测试发送info日志
     */
    @Test
    public void testSend() {
        while (true){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
