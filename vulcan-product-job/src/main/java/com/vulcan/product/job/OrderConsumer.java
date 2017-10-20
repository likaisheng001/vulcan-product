package com.vulcan.product.job;
import java.util.List;
import java.util.Random;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeOrderlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeOrderlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerOrderly;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.message.MessageExt;

public class OrderConsumer {
    public static void main(String[] args) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(
                "testGroup");

        consumer.setNamesrvAddr("101.200.37.71:9876");
        consumer.setInstanceName("consumer");
        consumer.subscribe("TopicA-test", "TAG");  //消费端订阅topic
        
        consumer.registerMessageListener(new MessageListenerOrderly() {
			
			@Override
			public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext context) {
				
				try {
					//模拟业务处理消息的时间
					Thread.sleep(new Random().nextInt(1000));
					System.out.println(new String(msgs.get(0).getBody(),"UTF-8"));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return ConsumeOrderlyStatus.SUCCESS;
			}
		});
        
        consumer.start();
        System.out.println("Consumer Started.");
    }
}