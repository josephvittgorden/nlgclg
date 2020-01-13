package com.igeek.other;

import com.igeek.AccessClass;

public class TestAccess {

	public static void main(String[] args) {
		// 不同一包中(无关类)
		AccessClass t = new AccessClass();
/*		t.method();
		t.method2();
		t.method3();*/
		t.method4();//public
	}

}
