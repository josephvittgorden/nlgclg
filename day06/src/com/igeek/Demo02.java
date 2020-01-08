package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:
 */
public class Demo02 {

	public static void main(String[] args) {
		File file = new File("D:\\nlgclg-workspace\\day06");
		//File file = new File("hello.txt");
		System.out.println(file);
		//绝对路径
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		//路径
		String path = file.getPath();
		System.out.println(path);
		//文件或者目录的名称
		String name = file.getName();
		System.out.println(name);
		//文件的父目录
		String parent = file.getParent();
		System.out.println(parent);
		//文件的长度
		long length = file.length();
		System.out.println(length);
		//文件最后一次修改的时间
		long time = file.lastModified();
		System.out.println(time);
		
		//文件或者目录的名称
		String[] list = file.list();
		for (String na : list) {
			System.out.println(na);
		}
		System.out.println("******************");
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
		}
		
		

	}

}
