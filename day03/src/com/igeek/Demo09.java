package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * boolean equals(Object obj):比较字符串的内容是否相同
   boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
   boolean startsWith(String str):判断字符串对象是否以指定的str开头
   boolean endsWith(String str):判断字符串对象是否以指定的str结尾
 */
public class Demo09 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "HellO";
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.endsWith("lol"));

	}

}
