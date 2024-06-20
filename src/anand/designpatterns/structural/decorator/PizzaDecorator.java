package anand.designpatterns.structural.decorator;

public abstract class PizzaDecorator implements Pizza {
	@Override
	public String getDesc() {
		return "Toppings";
	}
}
