package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 使用this可以区分成员变量与局部变量,处理成员变量与局部变量同名的情况
* 
* 如果一个方法内访问不带this的变量,则遵循以下顺序:先查找局部变量,再查找成员变量
* 如果一个方法内访问带this的变量,则只在成员位置找
* 
* this的意义:代表当前对象的引用
* 
* 类的方法定义过程当中可以定义this,代表当前调用方法的对象,是一个不确定的对象.
* 即简单记忆为哪个对象调用方法,则方法中的this代表哪个对象
* 
* super:代表的是直接父类对象的引用
 */
public class Person {

	// 成员变量
	/**
	 * @Fields name : 姓名
	 */
	private String name;
	/**
	 * @Fields age : 年龄
	 */
	private int age;
	
	public Person() {
		super();
		System.out.println("无参");
		//Constructor call must be the first statement in a constructor
	}
	
	public Person(String name) {
		this();
		this.name = name;
		System.out.println("带一个参数的");
	}

	public Person(String name, int age) {
		//显示的调用其他的构造方法
		//必须声明在首行:Constructor call must be the first statement in a constructor
		this(name);
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
	
	public void eat() {
		System.out.println("eat.......");
		sleep();
	}
	
	public void sleep() {
		System.out.println("sleep......");
	}

	//成员方法
	public static void main(String[] args) {
		Person p = new Person("zs", 12);
		System.out.println(p);
		p.eat();
	}
	
	

}
