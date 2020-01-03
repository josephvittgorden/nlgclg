package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:字符串的反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 */
public class Demo18 {
	
	public static void main(String[] args) {
		String s1 = "abc";
		
		char[] chs = s1.toCharArray();
		for (int i = 0,j=chs.length-1; i<=j; i++,j--) {
			//交换
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
		}
		
		String s2 = new String(chs);
		System.out.println(s2);
		
	}

}
