package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 
 * abstract class 类名字{
 * 
 * }
 * 
 * 1.抽象类不能创建对象
 * 2.抽象类是可以有普通的方法
 * 3.抽象类中,不一定有抽象方法,但是有抽象方法的类必定是抽象类
 * 4.抽象类中,可以构造方法;是供子类创建对象时,初始化父类成员来使用
 * 5.抽象类的子类,必须重写抽象类中的抽象方法;如果不重写,还应定义为抽象类
 * 
 */
public class Demo01 {
	
	//The abstract method sleep in type Demo01 can only be defined by an abstract class
	//abstract void sleep();
	
	public static void main(String[] args) {
		
		//Cannot instantiate the type Animal
		//Animal animal = new Animal();
		
		Cat c = new Cat("猫","猫科类");
		c.run();
		System.out.println(c.getName());
	}

}
