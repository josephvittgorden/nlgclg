package com.igeek.hb;

public class User {
	
	private String name;//姓名
	private int money;//余额
	
	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//显示当前用户的金额
	public void show() {
		System.out.println("姓名:"+name+"的金额:"+money);
	}
	
	
	

}
