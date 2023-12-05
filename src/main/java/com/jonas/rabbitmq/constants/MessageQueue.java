package com.jonas.rabbitmq.constants;

/**
 * 消息队列
 *
 * @author shenjy
 * @time 2023/12/4 15:48
 */
public class MessageQueue {
    // 普通模式
    public static final String NORMAL_QUEUE = "normal_queue";

    // 工作模式
    public static final String WORK_QUEUE = "work_queue";

    // 广播模式
    public static final String FANOUT_QUEUE = "fanout_queue";

    // 路由模式
    public static final String ROUTE_QUEUE_1 = "route_queue_1";
    public static final String ROUTE_QUEUE_2 = "route_queue_2";

    // 主题模式
    public static final String TOPIC_QUEUE_1 = "topic_queue_1";
    public static final String TOPIC_QUEUE_2 = "topic_queue_2";
}
