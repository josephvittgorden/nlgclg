package com.igeek;

import java.io.IOException;
import java.text.ParseException;
import java.util.zip.DataFormatException;

/**
 * @author zx
 * @version1.0
 * @description:
 * 
 * 子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类。
 * 
 * 如果父类抛出了多个异常,子类重写父类时,只能抛出相同的异常或者是他的子集,子类不能抛出父类没有的异常
 * 
 * 如果被重写的方法没有异常抛出,那么子类的方法绝对不可以抛出异常,如果子类方法内有异常发生,那么子类只能try,不能throws
 * 
 */

public class Fu {
	
	public void method () /*throws ParseException,DataFormatException*/{
		
	}

}

class Zi extends Fu {
	//子类中重写父类的方法
	
	@Override
	public void method(){
		// TODO Auto-generated method stub
		super.method();
	}
	
	
}
