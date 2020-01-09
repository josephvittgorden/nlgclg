package com.igeek;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:ByteArrayOutputStream:该类实现了将数据写入字节数组的输出流
 */
public class Demo06 {
	
	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		String msg = "hello world";
		
		byte[] datas = msg.getBytes();
		
		bos.write(datas, 0, datas.length);
		bos.flush();
		//toByteArray()
		byte[] tmp = bos.toByteArray();
		System.out.println(new String(tmp,0,tmp.length));
		
		bos.close();
		
	}

}
