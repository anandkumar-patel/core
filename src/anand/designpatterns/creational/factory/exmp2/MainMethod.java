package anand.designpatterns.creational.factory.exmp2;

public class MainMethod {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}

}
