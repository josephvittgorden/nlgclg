package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * 1.直接显示初始化
 * 2.构造方法初始化;setXxx()就不能使用
 */
public class User {
	
	private final String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

/*	public void setName(String name) {
		this.name = name;
	}*/
	

}
