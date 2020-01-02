package com.igeek;

/**
 * @author zx @version1.0
 * @description: 算术运算符
 */
public class Demo06 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		//取整
		System.out.println(a/b);
		//取余
		System.out.println(a%b);
		System.out.println("*********************");
		//判断1~10范围内的偶数并打印在控制台
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
