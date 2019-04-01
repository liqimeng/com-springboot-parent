package com.springboot.test;

import com.springboot.test.RabbitMQ.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hp on 2019-4-1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootStart.class)
public class RabbitmqTest {
    @Autowired
    private Sender sender;

    @Test
    public void test() throws Exception {
       sender.send();
    }

}
