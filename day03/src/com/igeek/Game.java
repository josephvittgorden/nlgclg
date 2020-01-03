package com.igeek;

public class Game extends Item{
	
	String type;
	String platform;
	
	public Game(String name, int playingTime, String description,String type,String platform) {
		super(name, playingTime, description);
		this.type = type;
		this.platform = platform;
	}
	
	@Override
	public void print() {
		System.out.println(name+";"+type+";"+platform);
	}
	

}
