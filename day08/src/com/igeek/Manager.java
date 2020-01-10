package com.igeek;

public class Manager extends Employee implements Drivable{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println("管理酒店");
	}

	@Override
	public void test() {
		
	}

	@Override
	public void filedDrive() {
		
	}

	@Override
	public void roadDrive() {
		
	}

}
