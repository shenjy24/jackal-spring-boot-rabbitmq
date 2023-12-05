package com.jonas.rabbitmq;

import com.jonas.rabbitmq.service.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private MessageService messageService;

    @Test
    void testSendMessage() {

    }
}
