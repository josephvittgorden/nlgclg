package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version1.0
 * @description:把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：int[] arr = {1,2,3};	
 * 输出结果：$1, 2, 3$
 * 分析：
 * 		A:定义一个int类型的数组
 * 		B:写方法实现把数组中的元素按照指定的格式拼接成一个字符串
 * 		C:调用方法
 * 		D:输出结果
 */
public class Demo17 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(int[] arr) {
//		String str = "$";
//		for (int i = 0; i < arr.length; i++) {
//			if(i == arr.length-1) {
//				str += arr[i];
//			}else {
//				str += arr[i]+",";
//			}
//		}
//		str += "$";
//		return str;
		
		StringBuilder builder = new StringBuilder("$");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				builder.append(arr[i]);
			}else {
				builder.append(arr[i]).append(",");
			}
		}
		builder.append("$");
		return builder.toString();
	}

}
