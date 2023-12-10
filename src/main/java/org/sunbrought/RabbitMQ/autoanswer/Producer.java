package org.sunbrought.RabbitMQ.autoanswer;

import com.rabbitmq.client.Channel;
import org.sunbrought.RabbitMQ.utils.RabbitMqUtils;

import java.util.Scanner;

/**
 * 消息在手动应答时不丢失，放回队列中重新消费
 */
public class Producer {

    private static final String TASK_QUEUE_NAME = "ack_queue";

    public static void main(String[] args) throws Exception {
        try (Channel channel = RabbitMqUtils.getChannel()) {
            channel.queueDeclare(TASK_QUEUE_NAME, false, false, false, null);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入信息");
            while (sc.hasNext()) {
                String message = sc.nextLine();
                channel.basicPublish("", TASK_QUEUE_NAME, null, message.getBytes("UTF-8"));
                System.out.println("生产者发出消息" + message);
            }
        }
    }
}
