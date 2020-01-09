package com.igeek;

public class Demo02 extends Demo01{
	
	public Demo02() {
		super();
		System.out.println("Demo02无参的构造方法");
	}

	private int value;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		value = 200;
		name = "ls";
		System.out.println(value);
		System.out.println(name);
		//调用父类的属性
		System.out.println(super.value);
		System.out.println(super.getName());
		//调用父类的方法
		super.print();
	}
	
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		demo02.print();
	}

}
