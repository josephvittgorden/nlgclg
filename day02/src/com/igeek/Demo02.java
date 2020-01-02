package com.igeek;

import java.util.Random;

public class Demo02 {

	public static void main(String[] args) {
		Random random = new Random();
		//0~10 [) 1~10 
		int i = random.nextInt(100)+1;
		System.out.println(i);
	}

}
