package com.igeek;

import java.util.Date;

/**
 * @author zx
 * @version1.0
 * @description:日期类Date
 */
public class Demo08 {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//获取毫秒值
		long milliseconds  = date.getTime();
		System.out.println(milliseconds );
		//设置毫秒值
		Date date2 = new Date();
		date2.setTime(milliseconds);
		System.out.println(date2);
	}

}
