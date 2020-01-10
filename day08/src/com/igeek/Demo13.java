package com.igeek;

public class Demo13 {
	
	String name = "zs";
	
	static String school = "软通极客";
	
	static {
		//Cannot make a static reference to the non-static field name
		//System.out.println(name);
		/*System.out.println(school);
		print();*/
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("代码块");
	}
	
	public void test() {
		//局部代码块
		{
			String name = "ls";
			System.out.println(name);
		}
		System.out.println(name);
	}
	
	public static void print() {
		System.out.println(school);
	}
	
	public static void main(String[] args) {
		
		Demo13 demo13 = null;
		
		/*Demo13 demo13 = new Demo13();
		Demo13 demo132 = new Demo13();
		demo132.test();
		Demo13 demo133 = new Demo13();*/
		
		
	}

}
