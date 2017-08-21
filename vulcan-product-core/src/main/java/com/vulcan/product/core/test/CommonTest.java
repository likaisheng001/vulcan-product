package com.vulcan.product.core.test;

import java.text.SimpleDateFormat;


public class CommonTest {
	public static void main(String[] args) {
		long parseLong = Long.parseLong("66659");
		System.err.println(parseLong);
	}
	public void test02(){
		try{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
			String format = simpleDateFormat.format("");
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
