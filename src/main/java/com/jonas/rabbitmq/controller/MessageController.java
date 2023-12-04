package com.jonas.rabbitmq.controller;

import com.jonas.rabbitmq.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MessageController
 *
 * @author shenjy
 * @time 2023/12/4 15:52
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessageController {
    private final MessageService messageService;

    /**
     * 发送消息
     *
     * @param queueName 主题名
     * @param message   消息
     */
    @PostMapping("/send")
    public void sendMessage(String queueName, String message) {
        messageService.sendMessage(queueName, message);
    }
}
