package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 1.接口中,无法定义成员变量;可以定义常量,值不改变的[public] [static] [final];
 * 2.接口中,没有构造方法,也不能创建对象
 * 3.接口中,没有静态代码块
 * 4.接口中,抽象方法,默认方法,静态方法,私有方法
 * A is B; A has B
 */
public class Demo07 {

	public static void main(String[] args) {
		Demo06 a = new Demo06();
		a.fly();
		
		//Demo06.swim();
		Demo05.swim();
	}

}
