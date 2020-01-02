package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:打印杨辉三角形的前10行
 * 
 * 1.第一个元素和最后一个元素都为1
 * 2.每个数等于它上方两数之和。
 */
public class Demo10 {
	
	public static void main(String[] args) {
		//1.声明二维数组
		int[][] yangHui = new int[10][];
		//2.初始化
		for (int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i+1];
			//首末元素都为1
			yangHui[i][0] = yangHui[i][i] = 1;
			//每个数等于它上方两数之和
			for (int j = 1; j < yangHui[i].length-1; j++) {
				yangHui[i][j] = yangHui[i-1][j]+yangHui[i-1][j-1];
			}
		}
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j]+"	");
			}
			System.out.println();
		}
		
		
	}

}
