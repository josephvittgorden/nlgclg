package com.igeek;

public class Cd extends Item{
	
	private String singer;
	
	public Cd(String name, String description,int playingTime, String singer) {
		super(name, playingTime, description);
		this.singer = singer;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public void print() {
		System.out.println(name+";"+singer);
	}
	

}
