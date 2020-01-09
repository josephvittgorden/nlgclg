package com.igeek;

//子类可以在父类基础上扩展新的属性与行为
public class Student extends Person{
	
	private String id;
	private String address;
	private String tel;
	
	
	public Student(String name, int age,String id, String address, String tel) {
		super(name,age);
		this.id = id;
		this.address = address;
		this.tel = tel;
	}
	
	//重写
	@Override
	public void eat() {
		super.eat();
		System.out.println("在食堂......");
	}
	
	public static void main(String[] args) {
		Student stu = new Student("zs", 12, "1001", "zj", "123456");
		stu.eat();
	}
	
	
	

}
