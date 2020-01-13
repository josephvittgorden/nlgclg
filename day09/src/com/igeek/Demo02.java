package com.igeek;

//The type Demo02 cannot subclass the final class Demo01
public class Demo02 extends Demo01{
	
	//Cannot override the final method from Demo01
	//无法被重写
	@Override
	public void print() {
		System.out.println("demo02 print....");
	}
	
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		demo02.print();
	}

}
