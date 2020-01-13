package com.igeek.hb;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Qun qun = new Qun("zs", 100);
		Member m1 = new Member("aa", 10);
		Member m2 = new Member("bb", 20);
		Member m3 = new Member("cc", 30);
		
		qun.show();
		m1.show();
		m2.show();
		m3.show();
		
		System.out.println("*****************************");
		ArrayList<Integer> redList = qun.send(20, 3);
		m1.receive(redList);
		m2.receive(redList);
		m3.receive(redList);
		
		qun.show();
		m1.show();
		m2.show();
		m3.show();

	}

}
