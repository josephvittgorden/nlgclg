package com.igeek;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求:文件的拷贝 
 * FileWriter FilerReader
 * read()
 * write()
 */
public class Demo11 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\nlgclg-workspace\\day06\\src\\com\\igeek\\FileUtils.java");
		
		FileWriter fw = new FileWriter("Copy.java");
		
		//读取数据
		char[] buffer = new char[1024];
		int len;
		while((len = fr.read(buffer)) != -1) {
			fw.write(buffer, 0, len);
		}
		
		//释放资源
		fw.close();
		fr.close();
		
		
	}

}
