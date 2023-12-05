package com.jonas.rabbitmq.constants;

/**
 * MessageKey
 *
 * @author shenjy
 * @time 2023/12/5 15:28
 */
public class MessageKey {

    //`*`：匹配一个单词，就只有一个单词
    //`#`：匹配一个或多个词
    public static final String TOPIC_KEY_1 = "topic.*";
    public static final String TOPIC_KEY_2 = "topic.#";
}
