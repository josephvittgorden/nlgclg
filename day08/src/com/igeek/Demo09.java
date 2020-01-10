package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 1.继承或者实现
 * 2.方法重写
 * 3.父类的引用指向子类对象
 */
public class Demo09 {

	public static void main(String[] args) {
		
		/*Student ls = new Student();
		ls.eat();*/
		
		Person p = new Student();
		p.eat();

	}

}
