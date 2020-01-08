package com.igeek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:BufferedReader
 * 从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
 */
public class Demo12 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\nlgclg-workspace\\day06\\src\\com\\igeek\\FileUtils.java"));
		//
		/*int len;
		while((len = br.read()) != -1) {
			System.out.print((char)len);
		}*/
		
		/*char[] chs = new char[1024];
		int len;
		while((len = br.read(chs)) != -1) {
			System.out.println(new String(chs, 0, len));
		}*/
		
		//读取一行
		//String str = br.readLine();
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		//释放资源
		br.close();
		

	}

}
