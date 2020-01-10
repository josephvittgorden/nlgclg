package com.igeek;

//员工类
public abstract class Employee {
	
	private String name;
	
	public abstract void work();

	public Employee(String name) {
		super();
		this.name = name;
	}

	

}
