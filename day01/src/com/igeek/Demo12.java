package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:Scanner键盘输入
 * 
 * 键盘录入两个数据，并对这两个数据求和，输出其结果
 * 键盘录入两个数据，比较这两个数据是否相等
 * 键盘录入三个数据，获取这三个数据中的最大值
 */
public class Demo12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int i = scanner.nextInt();
		System.out.println("请输入第二个数:");
		int j = scanner.nextInt();
//		System.out.println(i == j);
//		System.out.println(i + j);
		System.out.println("请输入第三个数:");
		int k = scanner.nextInt();
		int max = i>j ? i:j;
		max = max > k ? max : k;
		System.out.println(max);

	}

}
