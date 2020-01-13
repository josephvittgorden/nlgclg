package com.igeek;

public class Car {
	
	private boolean isStart = false;
	
	class Engine {
		
		public void start() {
			if(!isStart) {
				System.out.println("引擎在启动....");
			}else {
				System.out.println("引擎未启动....");
			}
		}
	}
	
	public static void main(String[] args) {
		new Car().new Engine().start();
	}

}
