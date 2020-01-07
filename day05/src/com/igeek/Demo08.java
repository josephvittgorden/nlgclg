package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zx
 * @version1.0
 * @description:Collections 工具了
 */
public class Demo08 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add("hello"+i);
		}
		System.out.println(list);
		//随机排列
		Collections.shuffle(list);
		System.out.println(list);
		//逆序
		Collections.reverse(list);
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//二分
		int index = Collections.binarySearch(list, "hello5");
		System.out.println(index);
		
		
		ArrayList<String> arr = new ArrayList<>();
		//可变参数
		Collections.addAll(arr, "a","b","c","d","e");
		System.out.println(arr);
	}

}
