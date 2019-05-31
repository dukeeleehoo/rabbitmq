package com.li;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqDirectProviderApplication.class)
public class RabbitMqDirectProviderApplicationTests {


    @Autowired
    private InfoMsgSend msgSend;

    /**
     * 测试发送info日志
     */
    @Test
    public void testSend() {
        msgSend.sendMsg("  info    hello hello");
    }


}
