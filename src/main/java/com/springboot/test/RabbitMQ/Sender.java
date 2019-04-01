package com.springboot.test.RabbitMQ;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2019-4-1.生产者类,通过队列first发送消息
 */
@Component
public class Sender {
    //说明：通过注入AmqpTemplate接口的实例来实现消息的发送，
    // AmqpTemplate接口定义了一套针对AMQP协议的基础操作
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        rabbitTemplate.convertAndSend("first", "test rabbitmq message !!!");
    }

}
