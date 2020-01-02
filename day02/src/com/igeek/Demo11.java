package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:二分查找(折半查找);前提:有序
 */
public class Demo11 {

	public static void main(String[] args) {
		
		int[] arr = {12,35,1,98,76};
		
		int key = 981;
		
		int left = 0;
		int right = arr.length-1;
		boolean flag = false;
		
		while (left<=right) {
			int middle = (left + right)/2;
			if(arr[middle] == key) {
				flag = true;
				break;
			}else if (arr[middle] > key) {
				right = middle-1;
			}else {
				left = middle + 1;
			}
		}
		
		if(flag) {
			System.out.println("找到");
		}else {
			System.out.println("未找到");
		}
		

	}

}
