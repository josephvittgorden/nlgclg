package com.igeek;

import java.util.LinkedList;

/**
 * @author zx
 * @version1.0
 * @description:LinkedList
 * 1.底层是链表结构;双链表;增删块
 * 2.
 */
public class Demo02 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		//添加元素 add()
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		System.out.println(linkedList);
		//addFirst()将指定的元素添加到链表的开头
		linkedList.addFirst("d");
		System.out.println(linkedList);
		//addLast()将指定的元素添加到链表的尾部
		linkedList.addLast("f");
		System.out.println(linkedList);
		//push()
		linkedList.push("g");
		System.out.println(linkedList);
		
		
		

	}

}
