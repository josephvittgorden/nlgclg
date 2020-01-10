package com.igeek;

public class Demo11 {

	public static void main(String[] args) {
		
		LapTop lapTop = new LapTop();
		lapTop.start();
		lapTop.run();
		
		Mouse mouse = new Mouse();
		//使用鼠标
		lapTop.useUSB(mouse);
		
		KeyBorder kb = new KeyBorder();
		lapTop.useUSB(kb);
		
		lapTop.shutDown();
	}

}
