package org.sunbrought.RabbitMQ.workqueue.hello;

import com.rabbitmq.client.*;
import org.sunbrought.RabbitMQ.utils.RabbitMqUtils;

/**
 * 工作线程 相当于之前的消费者
 *
 * (启动两次工作线程)
 */
public class WorkConsumer {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        System.out.println("工作队列等待接收消息.........");

        //推送的消息如何进行消费的接口回调
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println("接收到的消息：" + message);
        };
        Thread.sleep(5000);
        //取消消费的一个回调接口 如在消费的时候队列被删除掉了
        CancelCallback cancelCallback = (consumerTag) -> {
            System.out.println(consumerTag + "消费者取消消费接口回调逻辑");
        };
        /**
         * 消费者消费消息
         * 1.消费哪个队列
         * 2.消费成功之后是否要自动应答 true 代表自动应答 false 手动应答
         * 3.消费者未成功消费的回调
         * 4.消费者终止消费的回调
         */
        System.out.println("c2等待接收消息.......");
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, cancelCallback);
    }
}