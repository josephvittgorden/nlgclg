package decorator;

//抽象的装饰类
public abstract class Decorator implements Drink{
	
	private Drink decoratorMilk;

	public Decorator(Drink decoratorMilk) {
		super();
		this.decoratorMilk = decoratorMilk;
	}

	@Override
	public double cost() {
		return decoratorMilk.cost();
	}

	@Override
	public String info() {
		return decoratorMilk.info();
	}
	
	

}
