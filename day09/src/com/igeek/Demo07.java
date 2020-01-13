package com.igeek;


/**
 * 
 * @author zx
 * @version1.0
 * @description:匿名内部类
 * 局部内简化的写法
 * 
 * new 父类(){
 *		//重写需要重写的方法
 *	}; 
 * 
 */
public class Demo07 {
	
	public static void main(String[] args) {
		
		
		Student zs = new Student() {
			@Override
			void eat() {
				System.out.println("eat stu........");
			}
		};
		
		ExStudent ls = new ExStudent();
		method(ls);
		
		method(new Student() {
			@Override
			void eat() {
				System.out.println("my eat....");
			}
		});
		
	}
	
	//
	public static void method(Student stu) {
		stu.eat();
	}

}
