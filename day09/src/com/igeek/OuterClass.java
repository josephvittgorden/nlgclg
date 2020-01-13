package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 访问格式：
	只能在外部类的方法中创建对象并访问。
 */
public class OuterClass {
	
	String name = "zs";
	
	public void method() {
		
		//局部内部类
		class InnerClass {
			public void innerMethod() {
				System.out.println("innerMethod.....");
				System.out.println(name);
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.innerMethod();
	}
	
}
