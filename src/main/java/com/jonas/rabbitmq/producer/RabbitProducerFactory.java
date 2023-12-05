package com.jonas.rabbitmq.producer;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * RabbitProducerFactory
 *
 * @author shenjy
 * @time 2023/12/5 16:18
 */
@Component
public class RabbitProducerFactory {
    @Resource
    private final Map<String, RabbitProducer> producerMap = new ConcurrentHashMap<>();

    public RabbitProducer getProducer(String type) {
        if (!producerMap.containsKey(type)) {
            throw new RuntimeException("rabbitmq producer not found");
        }
        return producerMap.get(type);
    }
}
