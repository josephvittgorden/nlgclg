package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求:求数组中的最大值和最小值
 */
public class Demo05 {

	public static void main(String[] args) {
		int[] arr = {12,35,1,98,76};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println(max+";"+min);

	}

}
