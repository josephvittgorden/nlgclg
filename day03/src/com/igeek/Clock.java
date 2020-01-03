package com.igeek;

public class Clock {
	
	Time hour = new Time(24);
	Time minute = new Time(60);
	
	//启动方法
	public void start() {
		while(true) {
			minute.increase();
			if(minute.getValue() == 0) {
				hour.increase();
			}
			System.out.println(hour.getValue()+":"+minute.getValue());
		}
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.start();
	}
	
	

}
