package com.vulcan.product.core.test;

public class TestString {
	public static void main(String[] args) {
		String str = "hello\" world";
		String replaceAll = str.replaceAll("\"", "\\\\");
		System.out.println(replaceAll);
		System.out.println(str);
		
	}
}
