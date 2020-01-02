package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *(1)给定数组int[] arr = {5,7,3,2,5};
 *(2)要查询的元素通过键盘录入的方式确定
 *(3)定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 */
public class Demo25 {

	public static void main(String[] args) {
		int[] arr = {5,7,3,2,5};
		System.out.println(getIndex(arr, 15));
	}
	
	public static int getIndex(int[] arr,int key) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				index = i;
				break;
			}
		}
		return index;
	}

}
