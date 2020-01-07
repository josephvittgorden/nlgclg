package com.igeek;

import java.util.LinkedList;

public class Demo04 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		//添加元素 add()
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		//Retrieves and removes the head (first element) of this list.
		String ele = linkedList.remove();
		System.out.println(ele);
		System.out.println(linkedList);
		
		String ele1 = linkedList.removeFirst();
		System.out.println(ele1);
		System.out.println(linkedList);
		
		String ele2 = linkedList.removeLast();
		System.out.println(ele2);
		System.out.println(linkedList);

	}

}
