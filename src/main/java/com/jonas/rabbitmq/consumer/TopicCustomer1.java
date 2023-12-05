package com.jonas.rabbitmq.consumer;

import com.jonas.rabbitmq.constants.MessageExchange;
import com.jonas.rabbitmq.constants.MessageKey;
import com.jonas.rabbitmq.constants.MessageQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 主题模式消费者
 *
 * @author shenjy
 * @time 2023/12/5 14:17
 */
@Slf4j
@Component
public class TopicCustomer1 {

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = MessageQueue.TOPIC_QUEUE_1),
                    exchange = @Exchange(
                            value = MessageExchange.TOPIC_EXCHANGE,
                            type = ExchangeTypes.TOPIC
                    ),
                    key = MessageKey.TOPIC_KEY_1
            )
    )
    public void handleMessage(String message) {
        log.info("Received message: " + message);
    }

}
