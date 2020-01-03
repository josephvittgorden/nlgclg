package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 *String类的转换功能：
 * 	char[] toCharArray():把字符串转换为字符数组
 *  String toLowerCase():把字符串转换为小写字符串
 * 	String toUpperCase():把字符串转换为大写字符串
 */
public class Demo14 {

	public static void main(String[] args) {
		String str = "HelloworlD";
		
		char[] chs = str.toCharArray();
		for (char c : chs) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
