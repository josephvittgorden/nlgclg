package com.igeek;


/**
 * @author zx
 * @version1.0
 * @description:final关键字:不可变的
 * 类:被修饰的类,是不能被继承的
 * 方法:被修饰的方法,不能被重写
 * 变量:被修饰的变量,不能被重新赋值
 * final 
 */
public /*final*/ class Demo01 {
	
	//The blank final field a may not have been initialized
	static final int a = 10;

	public static void main(String[] args) {
		
		//The final field Demo01.a cannot be assigned
		//System.out.println(a = 20);
	}
	
	public /*final*/ void print() {
		System.out.println("print....");
	}

}
