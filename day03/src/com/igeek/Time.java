package com.igeek;

public class Time {
	
	int value;
	int limit;//60 24 12 
	
	public Time(int limit) {
		super();
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if(value == limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		
		Time hour = new Time(60);
		while(true) {
			hour.increase();
			System.out.println(hour.getValue());
		}
		
	}
	

}
