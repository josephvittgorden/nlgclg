package com.igeek;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:
 * window7 \r\n
 * linux \n
 * mac \r
 */
public class Demo09 {

	public static void main(String[] args) throws IOException {
		//append boolean if true, then data will be written to the end of the file rather than the beginning.
		FileWriter fw = new FileWriter("D:\\nlgclg-workspace\\day06\\a.txt",true);
		for (int i = 0; i < 10; i++) {
			fw.write("hello"+i);
			fw.write("\r\n");
		}
		fw.close();
	}

}
