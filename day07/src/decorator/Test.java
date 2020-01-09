package decorator;

/**
 * @author zx
 * @version1.0
 * @description:装饰模式:允许向一个现有的对象添加新的功能，同时又不改变其结构
 */
public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.say();
		
		Micro micro = new Micro(person);
		micro.say();
	}

}
