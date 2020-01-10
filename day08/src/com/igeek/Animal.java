package com.igeek;

//抽象类
public abstract class Animal {
	
	String name;
	String type;
	
	public Animal() {
		super();
	}
	
	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	//抽象方法
	//抽象方法指只有功能声明，没有功能主体实现的方法
	abstract void run();
	
	//普通方法
	void eat() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
