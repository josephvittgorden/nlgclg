package com.igeek;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author zx
 * @version1.0
 * @description:ByteArrayInputStream
 * 
 */
public class Demo05 {
	public static void main(String[] args) {
		
		byte[] src = "hello,world".getBytes();
		
		ByteArrayInputStream is = null;
		
		try {
			is = new ByteArrayInputStream(src);
			
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = is.read(buffer)) != -1) {
				String str = new String(buffer,0,len);
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
