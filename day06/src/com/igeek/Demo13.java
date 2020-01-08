package com.igeek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:BufferedWriter
 * 将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
 */
public class Demo13 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		bw.write("hello");
		//写一行
		bw.newLine();
		bw.write("wolrd");
		//刷新
		bw.flush();
		//释放资源
		bw.close();
	}

}
