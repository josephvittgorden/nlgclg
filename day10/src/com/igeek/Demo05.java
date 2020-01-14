package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:多个异常处理
 */
public class Demo05 {
	
	public static void main(String[] args) {
		
		//Unhandled exception type IOException
		try {
			method();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method() throws ArithmeticException, IOException{
		System.out.println(10/0);
		
		method2();
	}
	
	public static void method2() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();

		FileWriter fw = new FileWriter(path);
		System.out.println("输出成功了");
		
	}

}
