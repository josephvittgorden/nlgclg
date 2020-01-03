package com.igeek;

import java.util.ArrayList;

//代码复制
public class Db {
	
	ArrayList<Item> items = new ArrayList<>();
	
	//添加方法
	public void add(Item cd) {
		items.add(cd);
	}
	
	//列表展示功能
	public void list() {
		for (Item item : items) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		Db db = new Db();
		db.add(new Cd("透明", "邓紫棋", 3, "邓紫棋"));
		db.add(new Cd("一个人挺好", "孟颖", 3, "孟颖"));
		db.add(new Dvd("叶问4", "香港", 120, "叶问4"));
		db.add(new Game("英雄联盟",120,"英雄联盟","英雄联盟","英雄联盟"));
		db.list();
	}

}
