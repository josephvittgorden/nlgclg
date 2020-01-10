package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 接口不可以创建对象。子类必须覆盖掉接口中所有的抽象方法后，子类才可以实例化。否则子类是一个抽象类
 * 普通的变量是一个常量,默认修饰符public static final 
 * 抽象方法
 */
public class Demo04 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.swim();
//		bird.FLYHEIGHT = 200;
		
		SuperMan superMan = new SuperMan();
		superMan.fly();
		superMan.swim();
		
		//Cannot instantiate the type Fly
		//Fly fly = new Fly();

	}

}
