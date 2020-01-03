package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:String类代表字符串
 */
public class Demo07 {

	public static void main(String[] args) {
		String str = "abc";
		//等价于
		char[] chs = {'a','b','c'};
		String str2 = new String(chs);
		
		System.out.println(str);
		System.out.println(str2);
		
		String str3 = new String("abc");
		System.out.println(str3);
		//java.lang.StringIndexOutOfBoundsException:字符串越界了
		String str4 = new String(chs,1,2);
		System.out.println(str4);
		//length() 返回此字符串的长度。
		System.out.println(str4.length());
		
	}

}
