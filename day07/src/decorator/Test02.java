package decorator;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author zx
 * @version1.0
 * @description:
 * 1.抽象组件  需要被装饰的抽象对象 (接口/抽象类)
 * 2.具体组件  被装饰的对象
 * 3.抽象的装饰类(包含抽象组件的引用以及装饰的方法)
 * 4.具体的装饰类
 */
public class Test02 {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.cost()+coffee.info());
		
		Sugar sugar = new Sugar(coffee);
		System.out.println(sugar.cost()+sugar.info());
		
		Milk milk = new Milk(coffee);
		System.out.println(milk.cost()+milk.info());
		
		Milk milk2 = new Milk(sugar);
		System.out.println(milk2.cost()+milk2.info());
		
	}

}
