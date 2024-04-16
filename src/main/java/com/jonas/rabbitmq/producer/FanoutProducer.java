package com.jonas.rabbitmq.producer;

import com.jonas.rabbitmq.constants.MessageProducerType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * FanoutProducer
 *
 * @author shenjy
 * @time 2023/12/5 14:09
 */
@Slf4j
@Component(value = MessageProducerType.FANOUT_PRODUCER)
public class FanoutProducer extends RabbitProducer {

    public void sendMessage(String exchange, String routingKey, String message) {
        // 广播模式，不需要指定队列 和 routingKey，
        // 直接指定交换机，交换机 会将消息发送到所有和该交换机绑定的队列中
        // 就算指定 routingKey，在广播模式中也是不生效的，交换机还是会把消息推送到所有与之绑定的队列中
        rabbitTemplate.convertAndSend(exchange, "", message);
        log.info("Message sent: {}", message);
    }
}
