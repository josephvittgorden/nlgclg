package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 * 		一年有四季
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 *   穿透
 */
public class Demo19 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请录入一个月份");
		int month = scanner.nextInt();
		
		switch (month) {
		case 1: 
		case 2:
		case 12:
			System.out.println("冬天");
			break;
		case 3: 
		case 4:
		case 5:
			System.out.println("春天");
			break;
		case 6: 
		case 7:
		case 8:
			System.out.println("夏天");
			break;
		case 9: 
		case 10:
		case 11:
			System.out.println("秋天");
			break;
		default:
			System.out.println("输入的月份有误!!!");
			break;
		}
		
	}

}
