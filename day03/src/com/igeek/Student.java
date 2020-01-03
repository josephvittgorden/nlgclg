package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 *  成员变量 
	- 构造方法 
	无参构造方法 
	带参构造方法 
	- 成员方法 
	getXxx()
	setXxx()
 */
public class Student{
	
	//成员属性
	private int id;
	private String name;
	private int age;
	private String address;
	
	//构造方法
	public Student() {
		super();
		System.out.println("无参的构造方法");
	}
	
	//就近原则
	public Student(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//方法
	public void study() {
		System.out.println("learning.......");
	}
	
	public void eat() {
		System.out.println("eating......");
	}
	
	public void sleep() {
		System.out.println("sleep......");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Student zs = new Student(1,"zs",23,"南京");
		//?
//		System.out.println(zs.id);
		System.out.println(zs);
	}
	
	

}
