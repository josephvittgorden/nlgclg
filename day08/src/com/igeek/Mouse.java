package com.igeek;

public class Mouse implements USB{

	@Override
	public void open() {
		System.out.println("鼠标open");
	}

	@Override
	public void close() {
		System.out.println("鼠标close");
	}
	
	public void click() {
		System.out.println("鼠标点击");
	}

}
