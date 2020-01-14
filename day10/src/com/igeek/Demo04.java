package com.igeek;


/**
 * @author zx
 * @version1.0
 * @description:
 * 运行时异常;可以处理,也可以不处理
 */
public class Demo04 {

	public static void main(String[] args) {
		System.out.println(10/0);
		//java.lang.ArithmeticException
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}
		
		System.out.println("hello");
		
		try {
			method();
		} catch (Exception e) {
			System.out.println("除数不能为0");
		}
		
		System.out.println("hi");

	}
	
	public static void method() throws ArithmeticException{
		System.out.println(10/0);
	}

}
