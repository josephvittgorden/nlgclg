package com.igeek;

public class Dvd extends Item{
	
	private String director;
	
	public Dvd(String name, String description,int playingTime, String director) {
		super(name, playingTime, description);
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public void print() {
		System.out.println(name+";"+director);
	}
	
	

}
