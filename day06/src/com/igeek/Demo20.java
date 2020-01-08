package com.igeek;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * @author zx
 * @version1.0
 * @description:读取文件
 * readFileToString()
 */
public class Demo20 {

	public static void main(String[] args) throws IOException {
		
		String str = FileUtils.readFileToString(new File("b.txt"),"UTF-8");
		System.out.println(str);
		
		byte[] bs = FileUtils.readFileToByteArray(new File("a.txt"));
		System.out.println(bs.length);
		//逐行读取
		List<String> strs = FileUtils.readLines(new File("a.txt"),"UTF-8");
		for (String str2 : strs) {
			System.out.println(str2);
		}
		System.out.println("**********************************");
		LineIterator lineIterator = FileUtils.lineIterator(new File("a.txt"),"UTF-8");
		while (lineIterator.hasNext()) {
			System.out.println(lineIterator.nextLine());
		}
		

	}

}
