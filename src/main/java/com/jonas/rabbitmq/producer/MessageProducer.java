package com.jonas.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 *
 * @author shenjy
 * @time 2023/12/4 15:32
 */
@Component
@RequiredArgsConstructor
public class MessageProducer {

    private final AmqpTemplate amqpTemplate;

    /**
     * 发送消息
     *
     * @param queueName 主题名
     * @param message   消息
     */
    public void sendMessage(String queueName, String message) {
        amqpTemplate.convertAndSend(queueName, message);
        System.out.println("Message sent: " + message);
    }
}
