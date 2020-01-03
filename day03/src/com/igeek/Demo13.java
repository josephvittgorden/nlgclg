package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description: 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 */
public class Demo13 {

	public static void main(String[] args) {
		String str = "dhgdfgAKHDKJ456457&*WE32";
		
		int dx = 0;
		int xx = 0;
		int num = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				dx++;
			}
			else if(ch >= '0' && ch <= '9') {
				num++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				xx++;
			}
		}
		System.out.println(dx+";"+xx+";"+num);

	}

}
