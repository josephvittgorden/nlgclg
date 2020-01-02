package com.igeek;

public class Person implements Comparable{
	
	String name;
	int age;
	
	public Person(String name, int age) {
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Person person = (Person)o;
		/*if(this.age < person.getAge()) {
			return -1;
		}
		if(this.age > person.getAge()) {
			return 1;
		}
		return 0;*/
		return  person.getAge() - this.age;
	}
	
	
	

}
