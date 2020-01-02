package com.igeek;

import java.lang.Thread.State;

public enum Season2 {
	SPRING("春天"),
	SUMMER("夏天"),
	AUTUMN("秋天"),
	WINTER("冬天");

	// 1.声明 private final
	private final String seasonName;

	// 2.私有化构造器
	private Season2(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getSeasonName() {
		return seasonName;
	}

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + "]";
	}
	
	public static void main(String[] args) {
		Season2 summer = Season2.SUMMER;
		System.out.println(summer);
		System.out.println("****************");
		//values()
		Season2[] values = Season2.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println("****************");
		//valueOf()
		Season2 spring = Season2.valueOf("SPRING");
		System.out.println(spring);
		System.out.println("****************");
		State[] state = Thread.State.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(state[i]);
		}
	}

}
