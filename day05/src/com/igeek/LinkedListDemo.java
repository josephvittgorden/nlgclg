package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:模拟LinkedList
 */
public class LinkedListDemo {
	
	private Node first;
	private Node last;
	private int size;
	
	//add()
	public void add(Object o) {
		Node newNode = new Node(o);
		if(first == null) {
			first = newNode;
			last = newNode;
		}else {
			newNode.previous = last;
			newNode.next = null;
			last.next = newNode;
			last = newNode;
		}
		size++;
	}
	
	//add()
	public void add(int index,Object o) {
		//
		Node newNode = new Node(o);
		Node tmp = getNode(index);
		
		if(tmp != null) {
			Node pre = tmp.previous;
			if(pre != null) {
				pre.next = newNode;
				newNode.previous = pre;
				newNode.next = tmp;
				tmp.previous = newNode;
			}
		}
	}
	
	public Node getNode(int index) {
		Node tmp = null;
		if(index <= (size >> 1)) {
			tmp = first;
			for (int i = 0; i < index; i++) {
				tmp = tmp.next;
			}
		}else {
			tmp = last;
			for (int j = size-1; j> index; j--) {
				tmp = tmp.previous;
			}
		}
		return tmp;
	}
	
	//删除remove()
	//断链
	public void remove(int index) {
		Node tmp = getNode(index);
		if(tmp != null) {
			Node previous = tmp.previous;
			Node next = tmp.next;
			if(previous != null) {
				previous.next = next;
			}
			if(next != null) {
				next.previous = previous;
			}
			//删除的元素是第一个元素
			if(index == 0) {
				first = next;
			}
			if(index == size-1 ) {
				last = previous;
			}
			size--;
		}
	}
	
	//[a,b,c]
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("[");
		Node tmp = first;
		while(tmp != null) {
			stringBuilder.append(tmp.element).append(",");
			tmp = tmp.next;
		}
		stringBuilder.setCharAt(stringBuilder.length()-1, ']');
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
		demo.add("a");
		demo.add("b");
		demo.add("c");
		Node node = demo.getNode(2);
		System.out.println(node);
		demo.add(1, "d");
		System.out.println(demo);
		demo.remove(1);
		System.out.println(demo);
	}

	
}
