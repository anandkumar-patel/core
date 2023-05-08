package anand.learn.dp.decoratorpattern;

public abstract class PizzaDecorator implements Pizza {
	@Override
	public String getDesc() {
		return "Toppings";
	}
}
