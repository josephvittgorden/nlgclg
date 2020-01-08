package com.igeek;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:FileReader是用于读取字符流
 */
public class Demo10 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"D:\\nlgclg-workspace\\day06\\src\\com\\igeek\\FileUtils.java");
		/*int tmp = fr.read();
		int tmp2 = fr.read();
		int tmp3 = fr.read();
		int tmp4 = fr.read();
		System.out.println((char)tmp);
		System.out.println((char)tmp2);
		System.out.println((char)tmp3);
		System.out.println((char)tmp4);*/
		/*int ch = -1;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}*/
		
		char[] buffer = new char[1024];
		int len = -1;
		while( (len = fr.read(buffer)) != -1) {
			System.out.println(new String(buffer,0,len));
		}
		//释放资源
		fr.close();
	}

}
