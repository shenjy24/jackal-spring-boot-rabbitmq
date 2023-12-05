package com.jonas.rabbitmq.consumer;

import com.jonas.rabbitmq.constants.MessageQueue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * WorkQueue模式消费者
 *
 * @author shenjy
 * @time 2023/12/4 15:45
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class WorkQueueFastConsumer {

    @RabbitListener(queuesToDeclare = @Queue(value = MessageQueue.WORK_QUEUE))
    public void handleMessage(String message) {
        log.info("Received message: " + message);
        // 处理消息的业务逻辑
    }
}
