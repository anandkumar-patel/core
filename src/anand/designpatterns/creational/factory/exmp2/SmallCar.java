package anand.designpatterns.creational.factory.exmp2;

public class SmallCar extends Car {

	SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		// add accessories
	}
}
