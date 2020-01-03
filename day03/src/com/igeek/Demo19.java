package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * StringBuilder 1.5
 * StringBuffer 1.0
 * 
 * 	public int capacity():返回当前容量 (理论值)
	public int length():返回长度(已经存储的字符个数)
	public StringBuilder append(任意类型):添加数据，并返回自身对象
	public StringBuilder reverse():反转功能
 */
public class Demo19 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("hello");
		System.out.println(stringBuilder.capacity());
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.length());
		
		stringBuilder.append(true).append(10.25);
		System.out.println(stringBuilder);
		
		stringBuilder.reverse();
		System.out.println(stringBuilder);

	}

}
