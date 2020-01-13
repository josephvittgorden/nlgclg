package com.igeek.hb;

import java.util.ArrayList;

public class Qun extends User{

	public Qun(String name, int money) {
		super(name, money);
	}
	
	//发红包
	public ArrayList<Integer> send(int totalMoney,int count){
		//创建集合;存放红包的金额
		ArrayList<Integer> redList = new ArrayList<>();
		//当前群主账户金额
		int leftMoney = super.getMoney();
		if(totalMoney > leftMoney) {
			System.out.println("余额不足");
			return redList;//空集合
		}
		//更新用户账户
		setMoney(leftMoney-totalMoney);
		int avg = totalMoney / count;
		//不整除,有余数
		int mod = totalMoney % count;
		for (int i = 0; i < count-1; i++) {
			redList.add(avg);
		}
		//最后一个红包
		int last = avg+mod;
		redList.add(last);
		return redList;
	}
	
}
