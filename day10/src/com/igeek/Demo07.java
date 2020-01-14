package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:
 * 1.异常的体系结构 Throwable  Error Exception(RuntimeException)
 * 2.try{}catch(){}finall{} 
 * 3.throws
 * 4.自定义异常 
 * 5.抛出异常 throw
 */
public class Demo07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age < 18) {
			//产生异常
			//创建异常对象
			U18Exception u18Exception = new U18Exception("年龄小于18岁");
			//抛出异常
			try {
				throw u18Exception;
			} catch (U18Exception e) {
				e.printStackTrace();
				System.out.println("未成年");
			}
		}
		
		try {
			throw new RuntimeException("运行时异常");
		} catch (Exception e) {
			System.out.println("创建了运行时异常");
		}
		//Unreachable code
		System.out.println("hello");

	}

}
