package com.igeek;

import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:需求:模拟登录,给三次机会,并提示还有几次
 *  分析：
 * 		A:定义两个字符串对象，用于存储已经存在的用户名和密码
 * 		B:键盘录入用户名和密码
 * 		C:拿键盘录入的用户名和密码和已经存在的用户名和密码进行比较
 * 			如果内容相同，提示登录成功
 * 			如果内容不同，提示登录失败，并提示还有几次机会
 */
public class Demo10 {

	public static void main(String[] args) {
		//用户名和密码
		String username = "admin";
		String password = "admin";
		
		for (int i = 0; i < 3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入用户名:");
			String user = scanner.nextLine();
			System.out.println("请输入密码:");
			String pwd = scanner.nextLine();
			
			if(user.equals(username) && pwd.equals(password)) {
				System.out.println("登录成功!!!");
				break;
			}else {
				if(i == 2) {
					System.out.println("您的账户已被冻结;请稍后再试");
				}else {
					System.out.println("登录失败;您还剩"+(2-i)+"次机会,请重新登录");

				}
			}
			
		}
		
	}

}
