package com.igeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author zx
 * @version1.0
 * @description:根据用户的输入;打印当前月份的日历(控制台)
 */
public class Demo11 {
	
	public static void main(String[] args) throws ParseException {
		/*Scanner scanner =  new Scanner(System.in);
		System.out.println("请用户输入日期:(格式:2020-01-14)");
		String dateStr = scanner.nextLine();*/
		String dateStr = "2020-02-14";
		// String ==> Date
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdFormat.parse(dateStr);
		//日历对象
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		//当前天数
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		//重置为1号
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		//第一天
		int firstDay = calendar.get(Calendar.DAY_OF_MONTH);
		//判断1号是周几?  周日 1 周一 2 .....以此类推
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		//System.out.println("week:"+week);
		//最大值
		int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//控制1号的位置
		for (int i = 0; i < week-1; i++) {
			System.out.print("\t");
		}
		for (int i = firstDay; i <= max; i++) {
			//周六换行
			if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
				System.out.println();
			}else if (calendar.get(Calendar.DAY_OF_MONTH) == currentDay) {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*\t");
			}
			else {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		
	}

}
