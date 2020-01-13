package com.igeek;

public class Demo03 {
	
	public static void main(String[] args) {
		final int a ;
		a = 10;
		//第二次赋值
		//The final local variable a may already have been assigned
		//a = 20;
		final int b = 10 ;
		//b = 20;
		
		//写法1
		/*final int c = 0;
		for (int i = 0; i < 10; i++) {
			c = i;
			System.out.println(c);
		}*/
		//写法2
		for (int i = 0; i < 10; i++) {
			final int d = i;
			System.out.println(d);
		}
		
		//创建User对象
		final User user = new User("zs");
		//he final local variable user cannot be assigned. It must be blank and not using a compound assignment
		//user = new User();
		
		//user.setName("zs");
		
		
	}

}
