package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 *  aba     abba
 *  aba	    abba
 */
public class Demo21 {

	public static void main(String[] args) {
		System.out.println(isEqual("abba"));
	}
	
	public static boolean isEqual(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		//反转
		stringBuilder.reverse();
		String s2 = stringBuilder.toString();
		//比较字符串
		if(str.equals(s2)) {
			return true;
		}
		return false;
	}

}
