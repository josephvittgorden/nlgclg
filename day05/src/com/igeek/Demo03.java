package com.igeek;

import java.util.LinkedList;

public class Demo03 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		//添加元素 add()
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		
		String ele = linkedList.get(0);
		System.out.println(ele);
		//getFirst()返回此列表中的第一个元素。
		String ele2 = linkedList.getFirst();
		System.out.println(ele2);
		System.out.println(linkedList);
		//pop():返回并且删除
		String ele3 = linkedList.pop();
		System.out.println(ele3);
		System.out.println(linkedList);
		//clear():清空; java.util.NoSuchElementException
		linkedList.clear();
		//isEmpty():Returns true if this collection contains no elements. 
		if(!linkedList.isEmpty()) {
			//getLast()返回此列表中的最后一个元素。
			String ele4 = linkedList.getLast();
			System.out.println(ele4);
			System.out.println(linkedList);
		}

	}

}
