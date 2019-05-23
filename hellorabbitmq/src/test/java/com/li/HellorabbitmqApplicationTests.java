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
    private MsgSend msgSend;


    @Test
    public void testSend() {
        msgSend.sendMsg("hello hello");
    }


}
