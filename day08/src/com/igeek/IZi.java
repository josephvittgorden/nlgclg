package com.igeek;

public class IZi implements IFu{

	@Override
	public void method() {
		System.out.println("IZi.....");
	}
	
	public static void main(String[] args) {
		IFu iFu = new IZi();
		iFu.method();
	}

}
