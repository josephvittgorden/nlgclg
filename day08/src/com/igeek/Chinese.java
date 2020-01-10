package com.igeek;

public class Chinese {
	
	private String name;
	private int age;
	
	//国籍
	static String country = "中国";

	public Chinese(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Chinese.country = country;
	}
	
	public static void print() {
		System.out.println("I am chinese");
		//Cannot make a static reference to the non-static method eat() from the type Chinese
		//eat();
		//Cannot make a static reference to the non-static field name
		//System.out.println(name);
		System.out.println(country);
	}
	
	public void eat() {
		System.out.println("eat....");
		print();
		System.out.println(country);
	}
	
	public void walk() {
		System.out.println("walk....");
	}
	
	public static void main(String[] args) {
		Chinese c1 = new Chinese("zs", 23);
		Chinese c2 = new Chinese("ls", 24);
		System.out.println(c1.country);
		System.out.println(c2.country);
		c1.country = "美国";
		System.out.println(c2.country);
	}
	

}
