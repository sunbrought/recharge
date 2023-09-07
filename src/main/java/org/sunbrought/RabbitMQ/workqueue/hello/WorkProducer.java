package org.sunbrought.RabbitMQ.workqueue.hello;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.sunbrought.RabbitMQ.workqueue.utils.RabbitMqUtils;

import java.util.Scanner;

/**
 * 生产者发送大量消息
 *
 * 查看服务状态 service rabbitmq-server status
 * http://192.18.0.15:15672/ rmbbitmq页面
 */
public class WorkProducer {
    private final static String QUEUE_NAME = "hello";
    public static void main(String[] args) throws Exception {
        //获取信道
        Channel channel = RabbitMqUtils.getChannel();
        /**
         * 生成一个队列
         * 1.队列名称
         * 2.队列里面的消息是否持久化 默认消息存储在内存中
         * 3.该队列是否只供一个消费者进行消费 是否进行共享 true 可以多个消费者消费
         * 4.是否自动删除 最后一个消费者端开连接以后 该队列是否自动删除 true 自动删除
         * 5.其他参数
         */
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        //从控制台发送消息
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.next();
            /**
             * 发送一个消息
             * 1.发送到那个交换机
             * 2.路由的 key 是哪个
             * 3.其他的参数信息
             * 4.发送消息的消息体
             */
            //message.getBytes()  二进制内容进行发送
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
            System.out.println("工作发送队列消息《" + message +"》发送完成");
        }
    }
}
