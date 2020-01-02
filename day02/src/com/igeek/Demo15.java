package com.igeek;

public class Demo15 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		add(a,b);
		System.out.println(a+";"+b);//10,20
	}
	
	public static void add(int a,int b) {
		a++;
		b++;
		System.out.println(a+";"+b);//11;21
	}

}
