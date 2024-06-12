package com.liang.blog.config.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * rabbitMQ 消息接收者
 */
@Component
public class RabbitOrderReceiver {

    private RabbitTemplate rabbitTemplate;
    private MessageConverter messageConverter;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate, MessageConverter messageConverter) {
        this.rabbitTemplate = rabbitTemplate;
        this.messageConverter = messageConverter;
    }

    /**
     * 接收消息
     * @return 消息
     */
    public Object receiveOrder() {
        Message message = rabbitTemplate.receive("");
        return message != null ? messageConverter.fromMessage(message) : null;
    }


}
