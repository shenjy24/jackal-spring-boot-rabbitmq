package com.jonas.rabbitmq.producer;

import com.jonas.rabbitmq.constants.MessageProducerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * TopicProducer
 *
 * @author shenjy
 * @time 2023/12/5 15:22
 */
@Slf4j
@Component(value = MessageProducerType.TOPIC_PRODUCER)
public class TopicProducer extends RabbitProducer {

    /**
     * 发送消息
     *
     * @param exchange   交换机
     * @param routingKey 路由键
     * @param message    消息
     */
    public void sendMessage(String exchange, String routingKey, String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        log.info("Message sent: {}", message);
    }
}
