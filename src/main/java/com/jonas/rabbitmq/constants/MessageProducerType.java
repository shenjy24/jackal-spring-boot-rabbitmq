package com.jonas.rabbitmq.constants;

/**
 * 消息生产者类别
 *
 * @author shenjy
 * @time 2023/12/5 15:35
 */
public class MessageProducerType {

    // 普通模式
    public static final String NORMAL_PRODUCER = "normal_producer";
    // 工作队列模式
    public static final String WORK_QUEUE_PRODUCER = "work_queue_producer";
    // 广播模式
    public static final String FANOUT_PRODUCER = "fanout_producer";
    // 路由模式
    public static final String ROUTE_PRODUCER = "route_producer";
    // 主题模式
    public static final String TOPIC_PRODUCER = "topic_producer";
}
