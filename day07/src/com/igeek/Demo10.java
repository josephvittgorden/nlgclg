package com.igeek;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求:
 * 图片读取到字节数组流
 * 字节数组流给写入文件
 */
public class Demo10 {
	public static void main(String[] args) {
	}
	public static byte[] fileToByteArray(String pathName) {
		byte[] tmp = null;
		//选择合适的流
		try(FileInputStream fis = new FileInputStream(pathName);
				ByteArrayOutputStream baos = new ByteArrayOutputStream()){
			//读写操作
			byte[] buffer = new byte[1024];
			int len = -1;
			while ((len = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, len);
			}
			tmp = baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmp;
	}
	
	public static void byteArrayToFile(byte[] datas) {
		
	}

}
