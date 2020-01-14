package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();

		try {
			System.out.println(10/0);
			FileWriter fw = new FileWriter(path);
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源的代码
		}
	}

}
