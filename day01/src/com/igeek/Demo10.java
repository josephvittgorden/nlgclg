package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:逻辑运算符
 */
public class Demo10 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println((a > b) & (a > c));
		System.out.println((a < b) & (a > c));
		System.out.println((a < b) & (a < c));
		
		System.out.println((a > b) | (a > c));
		System.out.println((a < b) | (a > c));
		System.out.println((a < b) | (a < c));
		System.out.println("*************************");
		//异或
		System.out.println((a > b) ^ (a > c));//false ^ false
		System.out.println((a < b) ^ (a > c));//true ^ false
		System.out.println((a < b) ^ (a < c));//true ^ true
		System.out.println("*************************");
		//短路效果 && || 
		int x = 3;
		int y = 4;
//		System.out.println((x++ > 4) & (y++ > 5));
		System.out.println((x++ > 4) && (y++ > 5));
		System.out.println(x);//4
		System.out.println(y);//4
		// !取反
	}

}
