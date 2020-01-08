package com.igeek;

import java.io.File;

import org.apache.commons.io.FileUtils;
//sizeOf():统计大小

public class Demo18 {

	public static void main(String[] args) {
		//Returns the size of the specified file or directory. 
		long len = FileUtils.sizeOf(new File("D:\\nlgclg-workspace\\day06\\src\\com\\igeek\\FileUtils.java"));
		System.out.println(len);
		//目录
		long len2= FileUtils.sizeOf(new File("D:\\nlgclg-workspace\\day06"));
		System.out.println(len2);
	}

}
