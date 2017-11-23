package com.vulcan.product.core.test.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.junit.Test;

/**
 * 测试时间调整
 * @author likaisheng
 *
 */
public class APITest {
	
	@Test
	public void test002(){
		Calendar now=Calendar.getInstance();
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.MILLISECOND, 0);		
		Date time = now.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(time);
		System.out.println(format);
	}
	
	@Test
	public void test003(){
		String str = "2222#22222#4444";
		String[] split = str.split("#");
		for(String s : split ){
			System.out.println(s);
		}
	}
	
	@Test
	public void tokenerTest(){
		
		String str = new String("pId:17360410,skuId:1003500,price:34.1,saleableQnt:899|xxx:111");
		StringTokenizer goods = new StringTokenizer(str, "|");
		
//		String nextToken = goods.nextToken();
//		String xxx = goods.nextToken();
		
		Object nextElement = goods.nextElement();
		Object xxx = goods.nextElement();
	}
}
