package com.vulcan.product.core.test;


import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.vulcan.common.client.HttpClientUtil;
import com.vulcan.product.core.model.StockResult;

public class TestHttp {
	public static void main(String[] args) {
		HttpClientUtil instance = HttpClientUtil.getInstance();
		try {
			String doGetForString = instance.doGetForString("http://localhost:8080/purchase-retail-server/rest/skuRetail/querySkuRetailInfo");
			System.out.println(doGetForString);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void test001(){
		StockResult sss= (StockResult)null;
		Map<String, Object> map = new HashMap<String,Object>();
		Object object = map.get("111");
		
		System.out.println("sss"+object);
	}
}
