package com.igeek;

public class Demo01 {
	
	public int value = 300;
	private String name = "wu";
	
	
	public Demo01() {
		super();
		System.out.println("Demo01无参的构造方法");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		value = 100;
		name = "zs";
		System.out.println("Demo01:"+value+";"+name);
	}

}
