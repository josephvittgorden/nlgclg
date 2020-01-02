package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * 思考:对称;"aaa abba aba"
 */
public class Demo20 {

	public static void main(String[] args) {
		for (int i = 10000; i < 100000; i++) {
			int ge = i %10;
			int shi  = i/10%10;
			int qian = i/10/10/10%10;
			int wan = i/10/10/10/10%10;
			
			if((ge == wan) && (shi == qian)) {
				System.out.println(i);
			}
			
		}

	}

}
