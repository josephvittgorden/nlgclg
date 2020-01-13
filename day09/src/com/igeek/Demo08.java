package com.igeek;

public class Demo08 {
	
	public static void main(String[] args) {
		
		//1.等号右边:是匿名内部类,定义并创建实现该接口的对象
		//2.等号左边:多态
		FlyAble flyAble = new FlyAble() {
			
			@Override
			public void fly() {
				System.out.println("flying.....");
			}
		};
		
		flyAble.fly();
		
		showFly(flyAble);
		
		showFly(new FlyAble() {
			@Override
			public void fly() {
				System.out.println("my fly.....");
			}
		});
		
		
	}
	
	public static void showFly(FlyAble f) {
		f.fly();
	}

}
