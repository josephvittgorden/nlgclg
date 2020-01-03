package com.igeek;

import java.text.SimpleDateFormat;

/**
 * @author zx
 * @version1.0
 * @description:模拟电子时钟
 */
public class Demo04 {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		while (true) {
			try {
				System.out.println(sdf.format(System.currentTimeMillis()));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
