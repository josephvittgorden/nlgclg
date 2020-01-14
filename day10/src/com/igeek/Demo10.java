package com.igeek;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author zx
 * @version1.0
 * @description:日历类  Calendar抽象类
 * 实现日历类的子类:GregorianCalendar
 */
public class Demo10 {
	
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar);
		//获取年份 get(field)
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		//获取月份,从 0 开始
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month);
		//获取天数
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(dayOfMonth);
		int date = calendar.get(Calendar.DATE);
		System.out.println(date);
		//星期天 周一 周二 ......
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		//获取小时
		int hour = calendar.get(Calendar.HOUR);
		System.out.println(hour);
		
		//set()
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.set(Calendar.YEAR, 2029);
		System.out.println(calendar2.get(Calendar.YEAR));
		
		//add()
		calendar2.add(Calendar.YEAR, 5);
		System.out.println(calendar2.get(Calendar.YEAR));
		
		//getTime()
		Date date2 = calendar.getTime();
		System.out.println(date2);
		
		//setTime()
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.setTime(new Date());
		System.out.println(calendar3);
		
		/*Date date3 = new Date();
		int year2 = date3.getYear();
		System.out.println(year2);*/
		
		Calendar calendar4 = Calendar.getInstance();
		System.out.println(calendar4);
		
		
		
		
	}

}
