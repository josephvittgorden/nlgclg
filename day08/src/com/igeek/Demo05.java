package com.igeek;

public interface Demo05 {
	
	//默认方法
	public default void fly() {
		System.out.println("fly......");
	}
	
	//静态方法
	public static void swim() {
		System.out.println("swim.......");
	}
	
}
