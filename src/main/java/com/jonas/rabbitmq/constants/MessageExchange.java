package com.jonas.rabbitmq.constants;

/**
 * MessageExchanger
 *
 * @author shenjy
 * @time 2023/12/5 14:11
 */
public class MessageExchange {
    // 广播模式的交换机
    public static final String FANOUT_EXCHANGE = "fanout_exchange";
    // 路由模式的交换机
    public static final String ROUTE_EXCHANGE = "route_exchange";
    // 主题模式的交换机
    public static final String TOPIC_EXCHANGE = "topic_exchange";
}
