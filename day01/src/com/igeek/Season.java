package com.igeek;

/**
 * @author zx
 * @version1.0
 * @description:
 * jdk 1.5 新增enum 关键字用来定义枚举类;
 * 自定义枚举类
 * 
 * ctrl+shift+x:大写
 * ctrl+shift+y:小写
 */
public class Season {
	
	//1.声明 private final
	private final String seasonName;
	
	//2.私有化构造器
	private Season(String seasonName){
		this.seasonName = seasonName;
	}
	
	//3.提供自定义枚举类型的对象
	public static final Season SPRING = new Season("春天");
	public static final Season SUMMER = new Season("夏天");
	public static final Season AUTUMN = new Season("秋天");
	public static final Season WINTER = new Season("冬天");

	public String getSeasonName() {
		return seasonName;
	}

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + "]";
	}

}
