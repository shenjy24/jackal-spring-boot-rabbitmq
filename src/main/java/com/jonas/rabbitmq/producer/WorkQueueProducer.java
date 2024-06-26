package com.jonas.rabbitmq.producer;

import com.jonas.rabbitmq.constants.MessageProducerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * WorkQueue模式生产者
 *
 * @author shenjy
 * @time 2023/12/5 12:26
 */
@Slf4j
@Component(value = MessageProducerType.WORK_QUEUE_PRODUCER)
public class WorkQueueProducer extends RabbitProducer {

    private static final int NUM = 10;

    /**
     * 发送消息
     *
     * @param exchange   交换机
     * @param routingKey 路由键
     * @param message    消息
     */
    public void sendMessage(String exchange, String routingKey, String message) {
        for (int i = 0; i < NUM; i++) {
            rabbitTemplate.convertAndSend(routingKey, message);
            log.info("Message sent: {}", message);
        }
    }
}
