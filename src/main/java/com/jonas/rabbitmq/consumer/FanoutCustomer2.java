package com.jonas.rabbitmq.consumer;

import com.jonas.rabbitmq.constants.MessageExchange;
import com.jonas.rabbitmq.constants.MessageQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 广播模式消费者
 *
 * @author shenjy
 * @time 2023/12/5 14:17
 */
@Slf4j
@Component
public class FanoutCustomer2 {
    /**
     * bindings：用于声明交换机和队列的绑定，可以接收@QueueBinding类型数组。
     *
     * @QueueBinding：声明交换机和队列绑定。属性有value，用于声明队列；还有exchange，用于声明与之绑定的交换机。
     *
     * @Queue：前面说过了，用于声明队列并监听队列。
     *
     * @Exchange：声明交换机。属性有value，为交换机名称；type为交换机类型，也就是消息模型。
     *
     * key：是用于声明队列RoutingKey的，相当于队列的别名吧，交换机可以通过RoutingKey找到队列并投递消息，因为Fanout模型不需要，所以这里只是提
     *
     */
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = MessageQueue.FANOUT_QUEUE_2),
                    exchange = @Exchange(
                            value = MessageExchange.FANOUT_EXCHANGE,
                            type = ExchangeTypes.FANOUT
                    )
//					key = "fanout1"   在广播模式中，写key也是不生效的，为了避免歧义还是不要写为好
            )
    )
    public void handleMessage(String message) {
        log.info("Received message: {}", message);
    }

}
