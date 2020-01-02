package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:数组
 * 格式 1 数据类型[] 数组名
 * 格式 2 数据类型   数组名[]
 */
public class Demo04 {

	public static void main(String[] args) {
		int[] arr;
		int arr2[];
		//指定数组的长度
		int[] arr3 = new int[5];
		int[] arr4 = new int[] {1,2,3,4,5};
		//简化
		int[] arr5 = {1,2,3,4,5};
		
		System.out.println(arr5);
		System.out.println(arr5[0]);
		System.out.println(arr5[4]);
		//ArrayIndexOutOfBoundsException 数组越界
//		System.out.println(arr5[5]);
		//length;返回数组的长度
		System.out.println(arr5.length);
		
		//遍历
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		//foreach
		for(int i : arr5) {
			System.out.println(i);
		}
		
		int[] arr6 = arr5;
		
		for(int i : arr6) {
			System.out.println(i);
		}
	}

}
