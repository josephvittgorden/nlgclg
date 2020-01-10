package com.igeek;

public class SuperMan implements Fly,Swim{

	@Override
	public void fly() {
		System.out.println("SuperMan fly.....");
	}

	@Override
	public void swim() {
		System.out.println("SuperMan swim.....");
	}
	

}
