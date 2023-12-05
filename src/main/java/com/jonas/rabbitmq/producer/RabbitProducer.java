package com.jonas.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * RabbitProducer
 *
 * @author shenjy
 * @time 2023/12/5 15:36
 */
public abstract class RabbitProducer {

    @Autowired
    protected RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     *
     * @param exchange   交换机
     * @param routingKey 路由键
     * @param message    消息
     */
    public abstract void sendMessage(String exchange, String routingKey, String message);
}
