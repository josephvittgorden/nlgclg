package com.igeek;

//a has b
//The type Bird must implement the inherited abstract method Fly.fly()
public class Bird implements Fly,Swim{
	
	@Override
	public void fly() {
		System.out.println("Bird fly......");
	}

	@Override
	public void swim() {
		System.out.println("Bird Swim....");
	}
	
}
