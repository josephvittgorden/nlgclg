package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 
 * 类名.静态成员变量名
 * 类名.静态成员方法名(参数)
 * 对象名.静态成员变量名     	------不建议，出现警告
 * 对象名.静态成员方法名(参数) 	------不建议，出现警告
 */
public class Demo12 {
	
	static double pi = 3.14;

	public static void main(String[] args) {
		Demo12 demo12 = new Demo12();
		//被static修饰的成员属于类，不属于单个这个类的某个对象
		//The static field Demo12.pi should be accessed in a static way
		System.out.println(Demo12.pi);
		//Cannot make a static reference to the non-static method test() from the type Demo12
		Demo12.test();
		//The static method test() from the type Demo12 should be accessed in a static way
		demo12.test();
	}

	public static void test() {
		System.out.println("test.....");
	}
}
