package com.jonas.rabbitmq.producer;

import com.jonas.rabbitmq.constants.MessageProducerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 路由模式生产者
 *
 * @author shenjy
 * @time 2023/12/4 15:32
 */
@Slf4j
@Component(value = MessageProducerType.ROUTE_PRODUCER)
public class RouteProducer extends RabbitProducer {

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
