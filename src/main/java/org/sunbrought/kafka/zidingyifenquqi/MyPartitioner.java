package org.sunbrought.kafka.zidingyifenquqi;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

public class MyPartitioner implements Partitioner {
    @Override
    public int partition(String s, Object o, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {

        String msgValues = o1.toString();
        int partitioner;
        if (msgValues.contains("sun")) {
            partitioner = 0;
        } else {
            partitioner = 1;
        }
        return partitioner;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
