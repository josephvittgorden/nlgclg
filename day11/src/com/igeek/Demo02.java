package com.igeek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zx
 * @version1.0
 * @description:
 * Pattern
 * Matcher
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		//表达式对象
		Pattern pattern = Pattern.compile("\\w+");
		
		//Matcher对象
		Matcher matcher = pattern.matcher("asaddf&&25543");
		//Attempts to match the entire region against the pattern. 
		//boolean flag = matcher.matches(); 尝试将整个字符序列与该模式匹配
		//System.out.println(flag);
		/*boolean flag = matcher.find();  
		System.out.println(flag);
		System.out.println(matcher.group());
		
		boolean flag2 = matcher.find();
		System.out.println(flag2);
		System.out.println(matcher.group());
		
		boolean flag3 = matcher.find();
		System.out.println(flag3);*/
		//System.out.println(matcher.group());
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
