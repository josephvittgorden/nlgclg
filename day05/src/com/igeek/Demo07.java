package com.igeek;

import java.util.LinkedList;

/**
 * @author zx
 * @version1.0
 * @description:
 * 支持队列
 */
public class Demo07 {

	public static void main(String[] args) {
		LinkedList<String> que = new LinkedList<>();
		//Adds the specified element as the tail (last element) of this list.
		que.offer("java");
		que.offer("c");
		que.offer("c++");
		que.offer("python");
		System.out.println(que);
		//Retrieves and removes the head (first element) of this list.
		String ele = que.poll();
		System.out.println(ele);
		System.out.println(que);

	}

}
