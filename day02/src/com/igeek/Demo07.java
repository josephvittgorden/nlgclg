package com.igeek;

public class Demo07 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		
		int[] arr2 = arr;
		arr[2] = 400;
		for (int i : arr2) {
			System.out.println(i);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
