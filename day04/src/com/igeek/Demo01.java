package com.igeek;

/**
 * @author zx @version1.0
 * @description:对象数组
 * ctrl+shift+f:格式化
 */
public class Demo01 {

	public static void main(String[] args) {
		// 创建学生数组
		Student[] students = new Student[3];

		// 创建学生对象
		Student s1 = new Student("曹操", 40);
		Student s2 = new Student("刘备", 35);
		Student s3 = new Student("孙权", 30);

		// 把学生对象作为元素赋值给学生数组
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		//遍历
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
