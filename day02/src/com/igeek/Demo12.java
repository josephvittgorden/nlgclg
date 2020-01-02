package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version1.0
 * @description:Arrays工具类
 */
public class Demo12 {

	public static void main(String[] args) {
		int[] arr = {7,21,3};
		System.out.println(arr);
		//toString() 打印数组
		System.out.println(Arrays.toString(arr));
		//sort() 排序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		String[] arr2 = {"x","a","s"};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		//二分
		//java.lang.ArrayIndexOutOfBoundsException 数组越界异常
		int index = Arrays.binarySearch(arr, 21);
		System.out.println(arr[index]);
		
		//引用类型的排序
		Person[] persons = {new Person("zs", 32),new Person("ls", 22)};
		System.out.println(Arrays.toString(persons));
		Arrays.sort(persons);
		//Exception in thread "main" java.lang.ClassCastException: com.igeek.Person cannot be cast to java.lang.Comparable
		System.out.println(Arrays.toString(persons));
		

	}

}
