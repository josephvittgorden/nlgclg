package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:Math工具类
 */
public class Demo12 {

	public static void main(String[] args) {
		//四舍五入
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(3.5));
		//取整
		//上取整
		System.out.println(Math.ceil(3.2));
		//下取整
		System.out.println(Math.floor(3.2));
		//绝对值
		System.out.println(Math.abs(-40));
		//开方
		System.out.println(Math.sqrt(36));
		//幂次方
		System.out.println(Math.pow(5, 2));
		//随机数
		System.out.println(Math.random());//[0,1)
		//常量
		System.out.println(Math.PI);
		System.out.println(Math.E);

	}

}
