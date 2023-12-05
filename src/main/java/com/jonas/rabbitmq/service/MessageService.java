package com.jonas.rabbitmq.service;

import com.jonas.rabbitmq.producer.RabbitProducer;
import com.jonas.rabbitmq.producer.RabbitProducerFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * MessageService
 *
 * @author shenjy
 * @time 2023/12/4 15:50
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class MessageService {
    private final RabbitProducerFactory producerFactory;

    /**
     * 发送消息
     *
     * @param exchange   交换机
     * @param routingKey 路由键
     * @param message    消息
     */
    public void sendMessage(String producerType, String exchange, String routingKey, String message) {
        RabbitProducer rabbitProducer = producerFactory.getProducer(producerType);
        rabbitProducer.sendMessage(exchange, routingKey, message);
    }
}
