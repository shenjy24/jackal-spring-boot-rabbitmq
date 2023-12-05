package com.jonas.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * 路由模式生产者
 *
 * @author shenjy
 * @time 2023/12/4 15:32
 */
@Component
@RequiredArgsConstructor
public class RouteProducer {

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
        System.out.println("Message sent: " + message);
    }
}
