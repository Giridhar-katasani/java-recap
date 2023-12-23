package com.strings;

public class AllAboutString {
	public static void main(String[] args) {
		String str = "hello";
		String str1 = new String("hello");
		System.out.println(str == str1);
		str = "helloworld";
		System.out.println(str);
		System.out.println(str1);
		
		String str2 = str1;
		str2 = "new world";
		System.out.println(str2);
		System.out.println(str1);
		// change the str1;
		str1 = "raja";
		str2 = str1;
		
	}
}
