package com.igeek;

public class Demo02 {
	
	public static void f() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("hi");
	}
	
	public static void g() {
		f();
	}
	
	public static void h() {
		g();
	}
	
	public static void main(String[] args) {
		try {
			h();
		}catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("数组越界了");
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//Returns a short description of this throwable.
			System.out.println(e.toString());
		}
		System.out.println("hi");
	}

}
