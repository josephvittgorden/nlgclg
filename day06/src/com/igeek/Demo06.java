package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:
 * 	需求:打印文件的名称(包括子目录)
 */
public class Demo06 {

	public static void main(String[] args) {
//		print(1);
		printName(new File("D:\\nlgclg-workspace\\day06"));
	}
	
	//打印1~10
	public static void print(int n) {
		if(n > 10) {
			return;
		}
		System.out.println(n+" ");
		print(n+1);
	}
	
	public static void printName(File file) {
		System.out.println(file.getName());
		if((!file.exists()) || (file == null)) {
			return;
		}else if(file.isDirectory()){
			File[] files = file.listFiles();
			for (File file2 : files) {
				printName(file2);
			}
		}
	}

}
