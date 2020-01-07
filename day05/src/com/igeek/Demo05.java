package com.igeek;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo05 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		//添加元素 add()
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		
		//遍历
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("*****************");
		//foreach
		for(String str:linkedList) {
			System.out.println(str);
		}
		System.out.println("*****************");
		//迭代器
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
