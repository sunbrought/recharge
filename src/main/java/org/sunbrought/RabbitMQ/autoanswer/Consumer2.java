package org.sunbrought.RabbitMQ.autoanswer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import org.sunbrought.RabbitMQ.utils.RabbitMqUtils;
import org.sunbrought.RabbitMQ.utils.SleepUtils;

/**
 * 消息在手动应答时不丢失，放回队列中重新消费
 */
public class Consumer2 {

    private static final String ACK_QUEUE_NAME = "ack_queue";

    //接受消息
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        System.out.println("C2 等待接收消息处理时间较长");
        //消息消费的时候如何处理消息
        DeliverCallback deliverCallback=(consumerTag,delivery) -> {
            String message= new String(delivery.getBody());
            SleepUtils.sleep(30);
            System.out.println("接收到消息:"+message);
            /**
             * 1.消息标记 tag
             * 2.是否批量应答未应答消息
             */
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
    };
        //采用手动应答
        boolean autoAck=false;
        channel.basicConsume(ACK_QUEUE_NAME, autoAck, deliverCallback, (consumerTag) -> {
            System.out.println(consumerTag+"消费者取消消费接口回调逻辑");
        });
    }
}
