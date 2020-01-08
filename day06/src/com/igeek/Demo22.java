package com.igeek;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * @author zx
 * @version1.0
 * @description:复制
 */
public class Demo22 {

	public static void main(String[] args) throws IOException {
		//文件复制
		FileUtils.copyFile(new File("a.png"), new File("a-copy.png"));
		//复制文件到目录
		FileUtils.copyFileToDirectory(new File("a.txt"), new File("lib"));
		//复制目录
		FileUtils.copyDirectory(new File("lib"), new File("lib2"));
		
		String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1578480870501&di=81201a57dc52691f0b8b5e0f7136151d&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fe5f124bbfa8abed1571f80c90a9647bb81736d6f12a2b-TroKHX_fw658";
		FileUtils.copyURLToFile(new URL(url), new File("b.jpg"));
		
	}

}
