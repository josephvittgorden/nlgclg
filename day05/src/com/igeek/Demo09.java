package com.igeek;

public class Demo09 {

	public static void main(String[] args) {
		add(1,2,3,4,5,6,7,8,9);
	}
	
	//可变参数==> 本质上就是数组
	public static void add(int...is ) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		System.out.println(sum);
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}

}
