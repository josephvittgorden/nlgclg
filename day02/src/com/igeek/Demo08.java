package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:二维数组
 * 
 */
public class Demo08 {

	public static void main(String[] args) {
		int[][] arr;
		int arr2[][];
		//了解
		int[] arr3[];
		
		int[][] arr4 = new int[3][];
		int[][] arr5 = new int[][] {{1,2},{},{}};
		//简化
		int[][] arr6 = {{1,2},{3,4,5}};
		System.out.println(arr6);
		System.out.println(arr6[0]);
		System.out.println(arr6[0][0]);
		//length
		System.out.println(arr6.length);
		System.out.println(arr6[0].length);
		System.out.println(arr6[1].length);
		System.out.println("***********************");
		//遍历
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				System.out.print(arr6[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("***********************");
		//foreach
		for(int[] temp:arr6) {
			for(int temp2 : temp) {
				System.out.print(temp2+" ");
			}
			System.out.println();
		}

	}

}
