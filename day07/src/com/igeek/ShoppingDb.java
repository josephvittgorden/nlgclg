package com.igeek;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingDb {

	/**
	 * @Fields data : 成员位置定义集合,存储所有的商品项对象
	 */
	static ArrayList<GoodsItem> data = new ArrayList<GoodsItem>();

	public static void main(String[] args) {
		// 为集合准备数据
		initData();

		// 打印欢迎语句
		System.out.println("欢迎使用超市管理系统!");

		// 使用死循环完成反复操作的逻辑
		// for(;;) {}
		while (true) {
			// 使用switch给出操作选择：1输入购买数量2打印小票3退出
			// 提示信息
			System.out.println("请输入您要进行的操作:1输入购买数量   2打印小票   3退出");

			// 通过键盘录入得到数据
			Scanner sc = new Scanner(System.in);
			int optNumber = sc.nextInt();
			// 完成switch中三个case的逻辑
			switch (optNumber) {
			case 1:
				// System.out.println("给所有数据量赋值");
				// 调用给所有数据的数量与金额赋值方法
				enterNumber();

				break;
			case 2:
				// System.out.println("打印购物小票");
				// 调用打印购物小票的方法
				printReceipt();

				break;
			case 3:
				System.out.println("欢迎下次光临");
				// 退出程序
				System.exit(0);
			default:
				System.out.println("请输入正确的数字!");
				break;
			}
		}
	}

	public static void printReceipt() {
		
		int totalNum = 0;
		double totalMoney = 0;
		
		// 票头
		System.out.println("欢迎光临");
		System.out.println("品名\t售价\t数量\t单位\t金额");
		System.out.println("-------------------------------------------");
		// 票体
		for (int i = 0; i < data.size(); i++) {
			GoodsItem g = data.get(i);
			//打印
			System.out.println(g.getName()+"\t"+g.getPrice()+"\t"
					+g.getNumber()+"\t"+g.getUnit()+"\t"+g.getMoney());
			//累加数量与金额
			totalNum += g.getNumber();
			totalMoney += g.getMoney();
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("共"+data.size()+"项商品");
		System.out.println("共"+totalNum+"件商品");
		System.out.println("共"+totalMoney+"元");
		
	}

	public static void enterNumber() {
		//遍历
		for (int i = 0; i < data.size(); i++) {
			GoodsItem goodsItem = data.get(i);
			String goodName = goodsItem.getName();
			//提示用户输入商品的数量
			System.out.println("请输入"+goodName+"的购买数量");
			Scanner scanner = new Scanner(System.in);
			//商品数量
			int goodNum = scanner.nextInt();
			//商品金额:单价*数量
			double thisGoodMoney = goodsItem.getPrice()*goodNum;
			goodsItem.setNumber(goodNum);
			goodsItem.setMoney(thisGoodMoney);
		}
		
	}

	public static void initData() {
		data.add(new GoodsItem("酥饼核桃", "1001", 15.5, 0, "个", 0));
		data.add(new GoodsItem("牡丹饼", "1002", 14.5, 0, "个", 0));
	}

}
