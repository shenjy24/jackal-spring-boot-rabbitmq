package com.jonas.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * WorkQueue模式生产者
 *
 * @author shenjy
 * @time 2023/12/5 12:26
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class WorkQueueProducer {
    private final RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     *
     * @param queueName 主题名
     * @param message   消息
     */
    public void sendMessage(String queueName, String message) {
        rabbitTemplate.convertAndSend(queueName, message);
        System.out.println("Message sent: " + message);
    }
}
