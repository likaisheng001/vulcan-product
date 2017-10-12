package com.vulcan.product.job;
import java.util.List;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.chunbo.purchase.common.util.JSONUtil;

public class Consumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(
                "rmq-group");

        consumer.setNamesrvAddr("101.200.37.71:9876");
        consumer.setInstanceName("consumer");
        consumer.subscribe("TopicA-test", "TagA");

        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(
                    List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
            	try {
            		System.out.println("开始消费："+JSONUtil.toJSON(msgs));
            		for (MessageExt msg : msgs) {
                        System.out.println(new String(msg.getBody()));
                    }
            		int i = 10 / 0;
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
				} catch (Exception e) {
					System.out.println("发生异常，稍后消费 " + JSONUtil.toJSON(msgs));
					return ConsumeConcurrentlyStatus.RECONSUME_LATER;
				}
                
            }
        });
        consumer.start();
        System.out.println("Consumer Started.");
    }
}