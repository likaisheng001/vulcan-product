package com.vulcan.product.core.service.impl;

import com.vulcan.product.core.service.Observer;

public class WeixinObserver implements Observer{
	private String name; //微信用户名
	public WeixinObserver() {
		
	}
	public WeixinObserver(String name) {
		super();
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println(name + "-" +message);
	}
	
}
