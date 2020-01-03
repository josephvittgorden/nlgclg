package com.igeek;

public class Demo08 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);//false
		
		String s3 = new String("hello");
		System.out.println(s1 == s3);//false
		
		String s4 = "hello";
		System.out.println(s2 == s4);//true
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		

	}

}
