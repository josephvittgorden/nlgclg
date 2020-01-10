package com.igeek;

public class Waiter extends Employee{
	
	public Waiter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("等着顾客叫餐!");
	}

}
