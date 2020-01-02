package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:三元运算符
 * 关系表达式  ?  表达式1 : 表达式2
 */
public class Demo11 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a>b ? a:b;
		System.out.println(c);
		//比较三个数中的最大值
		int d = 30;
		
		int max = a>b ? a:b;
		max = max > d ? max : d;
		System.out.println(max);
	}

}
