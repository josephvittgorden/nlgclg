package com.igeek.other;

import com.igeek.AccessClass;

public class TestAccess02 extends AccessClass {

	public static void main(String[] args) {
		// 不同一包中(子类)
		TestAccess02 t = new TestAccess02();
//		t.method();
		t.method2();//protected 
//		t.method3();
		t.method4();//public
	}

}
