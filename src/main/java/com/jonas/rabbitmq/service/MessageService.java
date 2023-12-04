package com.jonas.rabbitmq.service;

import com.jonas.rabbitmq.producer.MessageProducer;
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
    private final MessageProducer messageProducer;

    /**
     * 发送消息
     *
     * @param queueName 主题名
     * @param message   消息
     */
    public void sendMessage(String queueName, String message) {
        messageProducer.sendMessage(queueName, message);
    }
}
