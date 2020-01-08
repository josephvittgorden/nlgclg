package com.igeek;

public class Demo17 {

	public static void main(String[] args) throws Exception {
		
		try(Demo16 demo16 = new Demo16();){
			demo16.print();
		}

	}

}
