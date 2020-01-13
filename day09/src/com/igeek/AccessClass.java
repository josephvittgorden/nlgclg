package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:4种访问权限修饰符
 * 
 * 1.只想在本类中访问使用 private
 * 2.同一包中,除了private
 * 3.本类的子类中访问使用 protected
 * 4.任意包中,public
 */
public class AccessClass {
	
	private void method() {
		System.out.println("private");
	}
	
	protected void method2() {
		System.out.println("protected");
	}
	
	void method3() {
		System.out.println("default");
	}
	
	public void method4() {
		System.out.println("public");
	}
	
	public static void main(String[] args) {
		//同一类中
		AccessClass t = new AccessClass();
		t.method();
		t.method2();
		t.method3();
		t.method4();
		
	}

}
