package com.igeek;

public class Person {
	
	//成员变量
	private boolean live = true;
	
	class Heart {
		
		public void jump() {
			//直接访问外部类成员
			if(live) {
				System.out.println("心脏跳动....");
			}else {
				System.out.println("心脏停止跳动....");
			}
		}
	}
	
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public static void main(String[] args) {
		Person p = new Person();
		Heart heart = p.new Heart();
		
		heart.jump();
		
		p.setLive(false);
		heart.jump();
	}
	

}
