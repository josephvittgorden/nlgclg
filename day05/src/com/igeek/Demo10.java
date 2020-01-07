package com.igeek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo10 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三", 21));
		list.add(new Person("李四", 22));
		list.add(new Person("王五", 18));
		
		//Collections.sort(list);
		
//		Collections.sort(list, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o2.getAge()-o1.getAge();
//			}
//		});
		
		Collections.sort(list,(o1,o2) -> o1.getAge()-o2.getAge());
		
		System.out.println(list);

	}

}
