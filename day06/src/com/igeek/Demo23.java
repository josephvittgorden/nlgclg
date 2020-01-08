package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zx 
 * @version1.0
 * @description: 
 * 把ArrayList集合中的字符串数据存储到文本文件 每一个字符串元素作为文件中的一行数据
 */
public class Demo23 {

	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 往集合中添加字符串元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();

	}

}
