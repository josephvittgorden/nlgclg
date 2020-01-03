package com.igeek;

public class Item {
	
	String name;
	int playingTime;
	String description;
	
	public Item(String name, int playingTime, String description) {
		super();
		this.name = name;
		this.playingTime = playingTime;
		this.description = description;
	}

	public void print() {
		System.out.println("item print...");
	}

}
