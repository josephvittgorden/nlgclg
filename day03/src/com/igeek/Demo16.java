package com.igeek;

import java.util.Arrays;

/**
 * @author zx
 * @version1.0
 * @description:
 * * 去除字符串两端空格	
*		String trim()
* 按照指定符号分割字符串	
*		String[] split(String str)
 */
public class Demo16 {

	public static void main(String[] args) {
		String s1 = "helloword";
		String s2 = " hell oword";
		String s3 = "hell o word ";
		System.out.println(s1.trim());
		System.out.println(s2.trim());
		System.out.println(s3);
		System.out.println(s3.trim());
		//Regular Expression 
		String s4 = "boo,and,foo";
		String[] s4s =s4.split("o");
		System.out.println(Arrays.toString(s4s));

	}

}
