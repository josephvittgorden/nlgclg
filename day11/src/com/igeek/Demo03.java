package com.igeek;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]");
		
		Matcher matcher = p.matcher("a7d23345**add7978*adfg9adh36456");
		
		//Replaces every subsequence of the input sequence that matches the pattern with the given replacement string. 
		//替换
		String newStr = matcher.replaceAll("#");
		System.out.println(newStr);

	}

}
