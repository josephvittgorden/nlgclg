package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:
 * 
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个评委打分的平均值。
 * 请写代码实现。(不考虑小数部分)
 */
public class Demo23 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner s = new Scanner(System.in);
		//录入成绩
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请"+(i+1)+"位评委评分");
			int num = s.nextInt();
			arr[i] = num;
		}
		//最高分;最低分
		int max = getMax(arr);
		int min = getMin(arr);
		//求和
		int sum = sum(arr);
		//平均分
		int avg = (sum - max - min)/(arr.length-2);
		System.out.println("成绩:"+avg);
		
	}

	public static int sum(int[] arr) {
		return 0;
	}

	public static int getMin(int[] arr) {
		return 0;
	}

	public static int getMax(int[] arr) {
		return 0;
	}

}
