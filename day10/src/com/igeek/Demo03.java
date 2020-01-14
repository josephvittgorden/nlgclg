package com.igeek;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author zx @version1.0
 * @description: 
 * 修饰符 返回值类型 方法名(参数类型参数名1,参数类型参数名2...) throws 异常类名 {
 * 
 *             } 
 */
public class Demo03 {

	public static void main(String[] args) throws IOException {
		method();
	}

	public static void method2() throws IOException {
		// 编译时异常
		// "d:/test.txt"
		// 指定文件
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件路径：");
		String path = sc.next();

		FileWriter fw = new FileWriter(path);
		System.out.println("输出成功了");
	}
	
	public static void method() throws IOException {
		method2();
	}

}
