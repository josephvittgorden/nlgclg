package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:冒泡排序
 * 过程:
 * 1.比较相邻元素;交换数据
 * 2.重复上面的过程
 */
public class Demo06 {
	
	public static void main(String[] args) {
		
		int[] arr = {12,35,1,98,76};
		
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-1-j; i++) {
				//比较相邻元素
				if(arr[i] > arr[i+1]) {
					//交换
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
