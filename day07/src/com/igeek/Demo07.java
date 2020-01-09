package com.igeek;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:FileInputStream
 */
public class Demo07 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\nlgclg-workspace\\day07\\src\\com\\igeek\\ShoppingDb.java");
		
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = fis.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}
		
		fis.close();
		

	}

}
