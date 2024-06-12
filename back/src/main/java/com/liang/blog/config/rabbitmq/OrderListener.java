package com.liang.blog.config.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * 订单监听
 */
public class OrderListener {


    @RabbitListener(queues = "orderQueue")
    public void receiveOrder(Object object) {
        System.out.println("receiveOrder" + object);
    }


}
