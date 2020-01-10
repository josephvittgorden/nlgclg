package com.igeek;


//The type Cat must implement the inherited abstract method Animal.run()
public class Cat extends Animal{

	public Cat() {
		super();
	}

	public Cat(String name, String type) {
		super(name, type);
	}

	@Override
	void run() {
		System.out.println("Cat run.......");
	}

}
