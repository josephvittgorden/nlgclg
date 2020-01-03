package com.igeek;

public class Demo20 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("hello");
		System.out.println(stringBuilder);
		
		//StringBuilder==> String
		String str = stringBuilder.toString();
		System.out.println(str);

	}

}
