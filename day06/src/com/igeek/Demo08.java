package com.igeek;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:FileWriter
 * FileWriter是用于写入字符流
 * void write(String str)  向文件中写str
 * void flush()  将内存中的数据刷新到文件中
 * void close()  关流释放系统底层资源
 */
public class Demo08 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\nlgclg-workspace\\day06\\hello.txt");
		fw.write("hello");
		fw.write("java", 0, 2);
		fw.write(97);
		fw.write('A');
		char[] chs = {'w','o','r','l','d'};
		fw.write(chs);
		fw.flush();
		fw.close();
	}

}
