package com.igeek;

/**
 * for
 * while
 * do...while
 * @author zx
 * @version1.0
 * @description:
 * 需求:求1~100的和
 */
public class Demo17 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("*******************");
		sum = 0;
		int j = 1;
		while (j<=100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		System.out.println("*******************");
		sum = 0;
		int k = 1;
		do {
			sum += k;
			k++;
		} while (k<=100);
		System.out.println(sum);
		//jdk1.5 foreach循环
		int arr[] = {1,2,3,4,5};
		for(int at : arr) {
			System.out.println(at);
		}

	}

}
