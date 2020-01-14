package com.igeek;

import java.util.Scanner;

/**
try {
	//可能会产生异常的代码
}
catch(Type ...) {
	//处理异常代码
}
*/
public class Demo01 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int idx;
		Scanner scanner = new Scanner(System.in);
		idx = scanner.nextInt();
		//java.lang.ArrayIndexOutOfBoundsException
		try {
			a[idx] = 10;
			System.out.println("hi");
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("caught");
		}
		
		System.out.println("hello");

	}

}
