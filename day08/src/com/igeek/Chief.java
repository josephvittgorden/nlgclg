package com.igeek;

public class Chief extends Employee{

	public Chief(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println("做菜");
	}

}
