package com.igeek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zx
 * @version1.0
 * @description:
 * 从文本文件中读取数据到ArrayList集合中，并遍历集合
 * 每一行数据作为一个字符串元素
 */
public class Demo24 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("stu.txt"));
		
		String str = null;
		while ((str = br.readLine()) != null) {
			array.add(str);
		}
		
		br.close();
		for (String string : array) {
			System.out.println(string);
		}

	}

}
