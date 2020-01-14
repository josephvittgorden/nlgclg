package com.igeek;


/**
 * @author zx
 * @version1.0
 * @description:包装类  Number抽象类
 */
public class Demo14 {
	
	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);
		
		Double d = 3.14;
		/**
		 * 自动拆箱：将基本类型包装类的对象转成该基本类型的数值
		 * 自动装箱：将基本类型的数值转成基本类型对应的包装类对象
		 */
		//装箱
		Double d1 = new Double(3.14);
		//拆箱
		double d2 = new Double(12.4);
		
		//不同类型之间的相互转换
		//基本类型转化成Integer对象
		Integer int1 = new Integer(10);
		Integer int2 = Integer.valueOf(20);
		//Integer转成int
		int int3 = int1.intValue();
		//字符串转成Integer对象
		Integer int4 = new Integer("789");
		//System.out.println(int4);
		int int5 = Integer.parseInt("456");
		//Integer对象转成字符串
		String str = int2.toString();
		System.out.println(str);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(10));
		
		
	}

}
