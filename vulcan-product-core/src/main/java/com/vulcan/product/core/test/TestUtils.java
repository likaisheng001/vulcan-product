package com.vulcan.product.core.test;

import com.chunbo.purchase.common.util.JSONUtil;
import com.vulcan.product.core.model.MyDate;

public class TestUtils {
	public static void main(String[] args) {
		String json ="{\"date\":1499443200000}";
		MyDate date = JSONUtil.toObject(json, MyDate.class);
		System.out.println(date);
		String json2 = JSONUtil.toJSON(date);
		System.out.println(json2);
		MyDate object = JSONUtil.toObject(json2, MyDate.class);
		System.out.println(object);
	}
}
