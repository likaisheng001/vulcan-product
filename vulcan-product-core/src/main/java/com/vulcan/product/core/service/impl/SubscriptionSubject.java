package com.vulcan.product.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.vulcan.product.core.service.Observer;
import com.vulcan.product.core.service.Subject;

/**
 * 微信公众号是具体主体，里面存储了订阅该公众号的微信用户，并实现了抽象主体中的方法
 * @author likaisheng
 *
 */
public class SubscriptionSubject implements Subject{

	private List<Observer> weixinUserlist = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		weixinUserlist.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		weixinUserlist.remove(observer);
	}

	@Override
	public void notify(String message) {
		for(Observer observer : weixinUserlist){
			observer.update(message);
		}
	}
}
