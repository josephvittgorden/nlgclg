package com.igeek;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author zx
 * @version1.0
 * @description:
 */
public class Demo21 {

	public static void main(String[] args) throws IOException {
		FileUtils.write(new File("aa.txt"), "learn fileUtils","UTF-8");
		FileUtils.writeStringToFile(new File("d.txt"), "learn fileUtils","UTF-8");
		FileUtils.writeByteArrayToFile(new File("e.txt"), "learn fileUtils".getBytes("UTF-8"));
		List<String> datas = new ArrayList<>();
		datas.add("java");
		datas.add("c");
		datas.add("c++");
		FileUtils.writeLines(new File("f.txts"), "UTF-8", datas);

	}

}
