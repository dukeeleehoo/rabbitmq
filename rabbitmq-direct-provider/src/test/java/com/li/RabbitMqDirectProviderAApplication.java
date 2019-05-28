package com.li;

import com.li.MsgSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqDirectProviderAApplication.class)
public class RabbitMqDirectProviderAApplication {


    @Autowired
    private MsgSend msgSend;


    @Test
    public void testSend() {
        msgSend.sendMsg("hello hello");
    }


}
