package com.liang.blog.config.rabbitmq;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitOrderMessageingService {


    private RabbitTemplate rabbitTemplate;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(Object task) {
        MessageConverter converter = rabbitTemplate.getMessageConverter();
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("HA_HA_HA","3");
        Message message = converter.toMessage(task, messageProperties);
        rabbitTemplate.send("", message);
    }



}
