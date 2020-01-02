package com.igeek;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zx
 * @version1.0
 * @description:猜数字
 * 
 * 猜数字小游戏案例
 *		系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 * 分析：
 * 		A:系统产生一个随机数1-100之间的。
 * 			int number = r.nextInt(100) + 1;
 * 		B:键盘录入我们要猜的数据
 * 			用Scanner实现
 *		C:比较这两个数据(用if语句)
 *			大了：给出提示大了
 *			小了：给出提示小了
 *			猜中了：给出提示，恭喜你，猜中了
 *		D:多次猜数据，而我们不知道要猜多少次，怎么办呢?
 */
public class Demo03 {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(100)+1;
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请用户输入数字:");
			int guessNum = scanner.nextInt();
			if(guessNum > i) {
				System.out.println("您猜的数字大了");
			}else if(guessNum < i) {
				System.out.println("您猜的数字小了");
			}else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
		
		

	}

}
