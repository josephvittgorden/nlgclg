package com.igeek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zx
 * @version1.0
 * @description:遍历
 * 
 * 1.size():返回集合中元素的个数
 */
public class Demo03 {

	public static void main(String[] args) {
		// 创建一个List集合对象,多态
		List<String> list = new ArrayList<>();
		// add();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (int i = 0; i < list.size(); i++) {
			String ele = list.get(i);
			System.out.println(ele);
		}
		System.out.println("***************************");
		//迭代器
		Iterator<String> iterator = list.iterator();
		//hasNext():Returns true if the iteration has more elements. 
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
		System.out.println("***************************");
		//foreach
		for(String str:list) {
			System.out.println(str);
		}
		
		
		

	}

}
