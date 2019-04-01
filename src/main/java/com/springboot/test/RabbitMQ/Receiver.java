package com.springboot.test.RabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2019-4-1.消息接收者，用于消息的接收
 */
@Component
@RabbitListener(queues="first")
public class Receiver {
    //说明：
   // @RabbitListener注解：定义该类需要监听的队列
    //@RabbitHandler注解：指定对消息的处理
    @RabbitHandler
    public void process(String msg) {
        System.out.println("receive msg : " + msg);
    }

}
