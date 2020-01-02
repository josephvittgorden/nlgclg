package com.igeek;

public class Demo07 {

	public static void main(String[] args) {
		char c1 = '0';
		char c2 = 'a';
		
		int a = 10;
		int b = 20;
		
		System.out.println((int)c1);
		System.out.println((int)c2);
		
		System.out.println(c1+c2);
		
		System.out.println(c1+a);
		System.out.println("hello"+b);
		System.out.println(a+b+"hello");
		System.out.println("hello"+a+b);
		
		//支持++ --
		int c = 30;
		c = a++;
		System.out.println(c);
		System.out.println(a);

	}

}
