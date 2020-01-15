package com.igeek;

import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		//String str = "a,b,c";
		//String[] arrs = str.split(",");
		String str = "e223f222223g";
		String[] arrs = str.split("\\d+");
		System.out.println(Arrays.toString(arrs));
	}

}
