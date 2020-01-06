package com.igeek;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @version1.0
 * @description:List ==>Collection
 * List特点:
 * 	1.有序的集合
 *  2.有索引的
 *  3.允许存储重复元素的
 *  
 *  1.add
 *  2.remove
 *  3.set
 *  4.get
 */
public class Demo02 {

	public static void main(String[] args) {
		//创建一个List集合对象,多态
		List<String> list = new ArrayList<>();
		//add();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		//打印
		System.out.println(list);
		
//		list.add(5, "e");
//		System.out.println(list);
		
		//remove()
//		String removeEle = list.remove(2);
//		System.out.println(removeEle);
		
		//set()
		list.set(3, "f");
		System.out.println(list);
		
		//get()
		String ele = list.get(2);
		System.out.println(ele);
		
		
		
		

	}

}
