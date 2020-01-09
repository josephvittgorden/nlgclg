package com.igeek;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zx 
 * @version1.0
 * @description:缓冲字节流
 * BufferedInputStream 
 * BufferedOutputStream
 */
public class Demo09 {

	public static void main(String[] args){
		
		try(BufferedInputStream fis = 
				new BufferedInputStream(new FileInputStream("D:\\nlgclg-workspace\\day07\\src\\com\\igeek\\ShoppingDb.java"));
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Copy02.java"));){
			//读写数据
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = fis.read(buffer)) != -1) {
				fos.write(buffer,0,len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
