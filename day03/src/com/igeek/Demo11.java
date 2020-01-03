package com.igeek;

/**
 * @author zx @version1.0
 * @description: 
 * String类的获取功能： 
 * int length():获取字符串的长度，其实也就是字符个数 
 * char charAt(intindex):获取指定索引处的字符 
 * int indexOf(String str):获取str在字符串对象中第一次出现的索引
 * String substring(int start):从start开始截取字符串
 * String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
 */
public class Demo11 {

	public static void main(String[] args) {
		String str = "abcadefghjk";
		System.out.println(str.length());
		System.out.println("*********************");
		System.out.println(str.charAt(5));
		System.out.println("*********************");
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("ade"));
		System.out.println("*********************");
		System.out.println("unhappy".substring(2));
		System.out.println("Harbison".substring(3));
		System.out.println("emptiness".substring(9));//an empty string
		//[)
		System.out.println("unhappy".substring(2,5));
		System.out.println("unhappy".substring(0, 1));

	}

}
