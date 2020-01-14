package com.igeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zx
 * @version1.0
 * @description:
 * format();
 * parse();
 */
public class Demo09 {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdDateFormat3 = new SimpleDateFormat("E");
		
		String dateStr = sdDateFormat.format(new Date());
		System.out.println(dateStr);
		String dateStr2 = sdDateFormat2.format(new Date());
		System.out.println(dateStr2);
		String dateStr3 = sdDateFormat3.format(new Date());
		System.out.println(dateStr3);
		
		String str = "2020-01-14 10:45:39";
		Date date = sdDateFormat.parse(str);
		System.out.println(date);
		
	}

}
