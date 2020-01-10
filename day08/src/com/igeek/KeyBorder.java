package com.igeek;

public class KeyBorder implements USB{

	@Override
	public void open() {
		System.out.println("键盘 open");
		
	}

	@Override
	public void close() {
		System.out.println("键盘 close");
	}
	
	public void type() {
		System.out.println("键盘打字");
	}

}
