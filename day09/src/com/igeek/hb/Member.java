package com.igeek.hb;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Member extends User{
	
	public Member(String name, int money) {
		super(name, money);
	}
	
	//领红包
	public void receive(ArrayList<Integer> redList) {
		//随机抽一个抽取一个红包
		int index = new Random().nextInt(redList.size());
		
		//remove();
		int redMoney = redList.remove(index);
		
		//普通成员的金额
		int money = super.getMoney();
		
		super.setMoney(money+redMoney);
		
	}

}
