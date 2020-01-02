package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:类型转换
 * 目标类型 变量名 = (目标类型) (被转换的数据);
 * 
 * 2进制->十进制
 * 1110 -> 14
 * 正数(三码合一)
 * 负数 原码 反码 补码
 * 0000 1110  14
 * 
 * 1000 1110  -14  原码
 * 1111 0001       反码
 * 1111 0010       补码
 * 
 * 127
 * 
 * 注释的快捷键
 * ctrl + /
 * ctrl +shift + /;ctrl +shift + \;
 * 
 */
public class Demo05 {

	public static void main(String[] args) {
		char c1 = 'a';
		int a = c1;
		//隐式类型转换;提升的效果
		char c2 = (char)a;
		System.out.println(a);

	}

}
