package com.igeek;

import java.io.File;

/**
 * @author zx
 * @version1.0
 * @description:
 * 需求:统计文件的大小(包括子文件)
 */
public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void count(File src) {
		long len = 0;
		if((src.exists()) || (src != null)) {
			if(src.isFile()) {
				len += src.length();
			}else {
				File[] files = src.listFiles();
				for (File file : files) {
					count(file);
				}
			}
		}
	}

}
