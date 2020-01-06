package com.igeek;

/**
 * @author zx @version1.0
 * @description:模拟ArrayList
 * 
 * Talk is cheap,Show me the Code
 */
public class ArrayListDemo<E> {

	Object[] elementData;

	int size;

	// 默认初始容量
	private static final int DEFAULT_CAPACITY = 10;

	public ArrayListDemo() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public ArrayListDemo(int initialCapacity) {
		if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			elementData = new Object[DEFAULT_CAPACITY];
		} else {
			throw new RuntimeException("Illegal initialCapacity");
		}
	}

	// add();
	public void add(E obj) {
		// 扩容?
		if (elementData.length == size) {
			Object newArray[] = new Object[elementData.length + (elementData.length >> 1)];
			// 拷贝
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		elementData[size++] = obj;
	}

	public E get(int index) {
		return (E) elementData[index];
	}
	
	public void remove(E ele) {
		for (int i = 0; i < size; i++) {
			if(ele.equals(get(i))) {
				//删除
				remove(i);
			}
		}
	}

	//remove();
	public void remove(int index) {
		int numMoved = size - index - 1;
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null; // clear to let GC do its work
	}
	
	public void set(E ele,int index) {
		elementData[index] = ele;
	}

	@Override
	// [ele1,ele2];
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < elementData.length; i++) {
			sb.append(elementData[i]).append(",");
		}
		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) {
		//generic type 
		ArrayListDemo<String> array = new ArrayListDemo<>();
		array.add("hello");
		array.add("java");
		array.add("c");
		array.add("c++");
		array.add("python");
		// int a = 10;
		// System.out.println(a + (a >> 1));
		// java.lang.ArrayIndexOutOfBoundsException
		for (int i = 0; i < 10; i++) {
			array.add(i + "");
		}
		System.out.println(array);
		array.add("10");
		System.out.println(array);
		/*
		 * int arr[] = {1,2,3,4,5}; int arr2[] = new int[5]; System.arraycopy(arr, 0,
		 * arr, 2, 2); System.out.println(Arrays.toString(arr));
		 */

	}

}
