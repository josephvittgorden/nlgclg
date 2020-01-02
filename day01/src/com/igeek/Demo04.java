package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:基本数据类型
 * ctrl+d 删除一行
 * alt+上下键
 */
public class Demo04 {
	
	int b;
	static boolean flag;
	
	public static void main(String[] args) {
		//Type mismatch: cannot convert from double to float
		float f = 1.23F;
		long l = 12355555555L;
		//支持一行声明多个变量
		int d,e,h;
		//局部变量使用就得先初始化
		int a = 0;
		System.out.println(a);
		Demo04 demo04 = new Demo04();
		System.out.println(demo04.b);
		System.out.println(flag);
		{
			int c = 10;
			System.out.println(c);
		}
		//System.out.println(c);
	}

}
