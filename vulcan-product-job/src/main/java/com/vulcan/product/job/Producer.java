package com.vulcan.product.job;
import java.util.Date;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

public class Producer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
        producer.setNamesrvAddr("101.200.37.71:9876");
        producer.setInstanceName("producer");
        producer.start();
        try {
            for (int i = 0; i < 1; i++) {
                Thread.sleep(1000);  //每秒发送一次MQ
                Message msg = new Message("TopicA-test",// topic
                        "TagA",// tag
                        (new Date() + "Hello RocketMQ ,QuickStart" + i + "vulcan_kaisheng")
                                .getBytes()// body
                );
                SendResult sendResult = producer.send(msg);
                System.out.println("发送了一条消息!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }
}