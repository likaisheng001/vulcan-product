package com.vulcan.product.core.test01;

import com.vulcan.product.core.service.impl.SubscriptionSubject;
import com.vulcan.product.core.service.impl.WeixinObserver;

public class Client {
	public static void main(String[] args) {
		SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
		//创建微信用户
		WeixinObserver user1 = new WeixinObserver("武梦");
		WeixinObserver user2 = new WeixinObserver("开生");
		WeixinObserver user3 = new WeixinObserver("闵杰");
		
		//订阅公众号
		subscriptionSubject.attach(user1);
		subscriptionSubject.attach(user2);
		subscriptionSubject.attach(user3);
		
		//公众号更新发出消息给订阅的微信用户
		subscriptionSubject.notify("小青的专栏有更新了");
	}
}
