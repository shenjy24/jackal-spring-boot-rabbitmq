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
     * @param producerType 生成者类型
     * @param exchange     交换机
     * @param routingKey   路由键
     * @param message      消息内容
     */
    @PostMapping("/send")
    public void sendMessage(String producerType, String exchange, String routingKey, String message) {
        messageService.sendMessage(producerType, exchange, routingKey, message);
    }
}
