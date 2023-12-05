package com.jonas.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * TopicProducer
 *
 * @author shenjy
 * @time 2023/12/5 15:22
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class TopicProducer {

    private final AmqpTemplate amqpTemplate;

    /**
     * 发送消息
     *
     * @param exchange   交换机
     * @param routingKey 路由键
     * @param message    消息
     */
    public void sendMessage(String exchange, String routingKey, String message) {
        amqpTemplate.convertAndSend(exchange, routingKey, message);
        log.info("Message sent: " + message);
    }
}
