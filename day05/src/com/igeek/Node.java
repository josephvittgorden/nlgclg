package com.igeek;

public class Node {
	
	Object element;//数据元素
	Node previous;//指向前驱
	Node next;//指向后继
	
	public Node(Object element, Node previous, Node next) {
		super();
		this.element = element;
		this.previous = previous;
		this.next = next;
	}

	public Node(Object element) {
		super();
		this.element = element;
	}

	@Override
	public String toString() {
		return "Node [element=" + element+"]";
	}
	
}
