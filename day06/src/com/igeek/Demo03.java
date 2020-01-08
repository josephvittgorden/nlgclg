package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:文件的判断功能
 */
public class Demo03 {

	public static void main(String[] args) {
		File file = new File("D:\\nlgclg-workspace\\day06");
		//File file = new File("hello.txt");
		//判断文件或目录是否存在
		boolean isExist = file.exists();
		System.out.println(isExist);
		//判断文件
		boolean isFile = file.isFile();
		System.out.println(isFile);
		//判断目录
		boolean isDir = file.isDirectory();
		System.out.println(isDir);
		//可读可写可执行
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}

	}

}
