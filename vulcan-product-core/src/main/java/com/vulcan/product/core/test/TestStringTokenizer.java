package com.vulcan.product.core.test;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String str = new String("pId:17360410,skuId:1003500,price:34.1,saleableQnt:899|xxx:111");
		StringTokenizer goods = new StringTokenizer(str, "|");
		
//		String nextToken = goods.nextToken();
//		String xxx = goods.nextToken();
		
		Object nextElement = goods.nextElement();
		Object xxx = goods.nextElement();
	}
}
