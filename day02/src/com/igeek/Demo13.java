package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			方法体;
			return 返回值;
	}
	
	方法的重载:1.方法名相同2.参数列表的个数3.参数的数据类型
 */
public class Demo13 {

	public static void main(String[] args) {
		System.out.println(add(3,4));
		System.out.println(add(3,4,5));
		System.out.println(add(3.14,56.8));
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static double add(double a,double b) {
		return a+b;
	}

}
