package decorator;

//具体的装饰类
public class Sugar extends Decorator {

	public Sugar(Drink decoratorMilk) {
		super(decoratorMilk);
	}

	@Override
	public double cost() {
		return super.cost()*2;
	}

	@Override
	public String info() {
		return super.info()+"加糖";
	}
	
	

}
