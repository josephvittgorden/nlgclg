package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:泛型
 */
public class Demo04 {

	public static void main(String[] args) {
		MyCollection<String> collection = new MyCollection<>();
		collection.set("java", 0);
		collection.set("c", 1);
		
		String str = collection.get(0);
		System.out.println(str);
//		String str = (String) collection.get(0);
//		Integer i = (Integer) collection.get(1);
	}
}
class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E obj,int index) {
		objs[index] = obj;
	}
	
	public E get(int index) {
		return (E) objs[index];
	}
}

