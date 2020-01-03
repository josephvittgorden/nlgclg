package com.igeek;

public class Demo05 {
	
	String name ;

	public static void main(String[] args) {
		Phone phone = new Phone("华为", 5000, "黑色");
		Phone phone2 = phone;
		phone2.setColor("红色");
		System.out.println(phone);
		System.out.println(phone2);
		int a = 0;
		System.out.println(a);

	}

}
