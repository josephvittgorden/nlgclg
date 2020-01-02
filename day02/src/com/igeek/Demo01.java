package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:break & continue
 */
public class Demo01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
//				break;
			}
			System.out.println(i);
		}
	}

}
