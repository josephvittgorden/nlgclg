package com.igeek;

import java.util.LinkedList;

/**
 * @author zx
 * @version1.0
 * @description:
 * 支持栈
 */
public class Demo06 {

	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<>();
		//入栈
		stack.push("java");
		stack.push("c");
		stack.push("c++");
		stack.push("python");
		System.out.println(stack);
		//出栈
		stack.pop();
		System.out.println(stack);
		//Retrieves, but does not remove, the head (first element) of this list.
		String ele = stack.peek();
		System.out.println(ele);
		System.out.println(stack);

	}

}
