package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 */
public class Demo24 {

	public static void main(String[] args) {
		int[] arr = {32,34,678,12,6};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int[] arr) {
		for (int i = 0,j = arr.length-1; i<=j; i++,j--) {
			//交换
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

}
