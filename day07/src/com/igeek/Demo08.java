package com.igeek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx @version1.0
 * @description:FileOutputStream
 * 
 */
public class Demo08 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\nlgclg-workspace\\day07\\src\\com\\igeek\\ShoppingDb.java");

		FileOutputStream fos = new FileOutputStream("Copy.java");
		//读写数据
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = fis.read(buffer)) != -1) {
			fos.write(buffer,0,len);
		}
		//释放资源
		fos.close();
		fis.close();

	}

}
