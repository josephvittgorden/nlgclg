package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:
 * boolean	mkdir()
 * 创建由此抽象路径名命名的目录。
 * boolean	mkdirs()
 * 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
 */
public class Demo05 {

	public static void main(String[] args) {
		
		File file = new File("d:/io/io1/io2/io3");
		//boolean flag = file.mkdir();
		boolean flag = file.mkdirs();
		System.out.println(flag);
		

	}

}
