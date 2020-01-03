package com.igeek;

public class Demo02 {

	public static void main(String[] args) {
		Student zs = new Student();
		//The field Student.id is not visible
//		System.out.println(zs.id);
		zs.setAge(23);
		System.out.println(zs);

	}

}
