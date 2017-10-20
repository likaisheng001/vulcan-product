package com.vulcan.product.core.service;

/**
 * 抽象主体,提供了attach(联系),detach(分离),notify(通知)三个方法
 * @author likaisheng
 *
 */
public interface Subject {
	
	/**
	 * 增加订阅者
	 * @param observer
	 */
	public void attach(Observer observer);
	
	/**
	 * 删除订阅者
	 * @param observer
	 */
	public void detach(Observer observer);
	
	/**
	 * 有修改时通知订阅者
	 * @param message
	 */
	public void notify(String message);

}
