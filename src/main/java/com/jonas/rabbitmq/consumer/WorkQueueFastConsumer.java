package com.jonas.rabbitmq.consumer;

import com.jonas.rabbitmq.constants.MessageQueue;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * WorkQueue模式消费者
 *
 * @author shenjy
 * @time 2023/12/4 15:45
 */
@Component
@RequiredArgsConstructor
public class WorkQueueFastConsumer {
    @RabbitListener(queues = MessageQueue.WORK_QUEUE)
    public void handleMessage(String message) {
        System.out.println("Received message: " + message);
        // 处理消息的业务逻辑
    }
}
