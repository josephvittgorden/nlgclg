package com.igeek;

import java.io.File;
import java.io.IOException;
/**
 * @author zx
 * @version1.0
 * @description:创建文件
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("hello.txt");
		if(!file.exists()) {
			//创建文件
			file.createNewFile();
			System.out.println("创建成功");
		}else {
			file.delete();
			System.out.println("删除成功");
		}

	}

}
