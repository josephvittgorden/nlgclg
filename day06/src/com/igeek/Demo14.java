package com.igeek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zx
 * @version1.0
 * @description:缓冲流拷贝文件
 * 读一行:readLine();
 * 写一行:newLine();
 */
public class Demo14 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(
					new FileReader("D:\\nlgclg-workspace\\day06\\src\\com\\igeek\\FileUtils.java"));
			bw = new BufferedWriter(new FileWriter("Copy2.java"));

			// 读取数据
			String str;
			while ((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		

		

	}

}
