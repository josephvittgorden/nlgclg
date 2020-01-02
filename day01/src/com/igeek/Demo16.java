package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:switch
 * int byte short char enum(枚举) JDK1.7后支持的String  
 * switch (key) {
		case value:
			
			break;

		default:
			break;
		}
		需求:根据键盘输入1,2,3,4,5
 */
public class Demo16 {
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入数字:");
//		int weekend = scanner.nextInt();
//		String weekend = "3";
		//The constructor Season(String) is not visible
//		char weekend = 'a';
		Season2 weekend = Season2.AUTUMN;
//		double weekend = 10.23;
		//Cannot switch on a value of type double. 
		//Only convertible int values, strings or enum variables are permitted
		switch (weekend) {
		case SPRING:
			System.out.println("周1");
			break;
		case SUMMER:
			System.out.println("周2");
			break;
		case AUTUMN:
			System.out.println("周3");
			break;
/*		case 4:
			System.out.println("周4");
			break;
		case 5:
			System.out.println("周5");
			break;
		case 6:
			System.out.println("周6");
			break;
		case 7:
			System.out.println("周7");
			break;*/
		default:
			System.out.println("非法数字");
			break;
		}
	}

}
