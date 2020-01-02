package com.igeek;

public class Demo16 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[5]);
		change(arr);
		System.out.println("******************");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
