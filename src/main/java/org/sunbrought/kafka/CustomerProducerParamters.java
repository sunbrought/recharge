package org.sunbrought.kafka;

import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * 提高吞吐量
 */
public class CustomerProducerParamters {
    public static void main(String[] args) {
        Properties props = new Properties();
        // Kafka 服务端的主机名和端口号
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "linux15:9092,linux20:9092");
//        // 等待所有副本节点的应答
//        props.put("acks", "all");
//        // 消息发送最大尝试次数
//        props.put("retries", 0);
//        // 一批消息处理大小
//        props.put("batch.size", 16384);
//        // 请求延时
//        props.put("linger.ms", 1);
//        // 发送缓存区内存大小
//        props.put("buffer.memory", 33554432);
        // key 序列化
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        // value 序列化
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        //增加缓冲区
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        //批次大小
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        //linger.ms等待时间
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        //压缩
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 5; i++) {
            producer.send(new ProducerRecord<String, String>("first",
                    Integer.toString(i), "hello world-" + i));
        }
        producer.close();
    }
}
