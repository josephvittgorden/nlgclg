package com.igeek;

import java.io.File;
import java.util.Properties;

/**
 * @author zx
 * @version1.0
 * @description:File
 * 文件和目录路径名的抽象表示
 * 
 * File(File parent, String child)
 * 从父抽象路径名和子路径名字符串创建新的 File实例。
 * File(String pathname)
 * 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
 * File(String parent, String child)
 * 从父路径名字符串和子路径名字符串创建新的 File实例。
 */
public class Demo01 {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		System.out.println(file);
		File file2 = new File("D:\\nlgclg-workspace\\day06\\hello.txt");
		System.out.println(file2);
		Properties prop = System.getProperties();
		System.out.println(File.separator);
		File file3 = new File("D:"+File.separator+"nlgclg-workspace"+File.separator
				+"day06"+File.separator+"hello.txt");
		
		File file4 = new File(new File("D:\\nlgclg-workspace\\day06"),"hello.txt");
		System.out.println(file4);
		
		File file5 = new File("D:\\nlgclg-workspace\\day06","hello.txt");
		System.out.println(file5);
		
		
	}

}
