package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * jdk1.7 try-with-resources
 */
public class Demo16 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing......");
	}
	
	public void print() {
		System.out.println("MyAutoCloseable");
	}

}
