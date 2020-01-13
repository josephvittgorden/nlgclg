package com.igeek;

import java.util.Date;

/**
 * @author zx
 * @version1.0
 * @description:域名反写 用”.”连接
 * 
 * 同包:默认省略,直接使用
 * 跨包:类全名
 */
public class Demo09 {
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		java.lang.String s2 = "abc";
		
		Person person = new Person();
		
		//类全名
		com.igeek.Person person2  = new Person();
		
		com.igeek.other.Person person3 = new com.igeek.other.Person();
		
		Date date  = new Date();
		
		java.sql.Date date2 = new java.sql.Date(1000);
		
		
	}

}
