package anand.java8.interfac;

public class BackwardCompatibility {

	public static void main(String[] args) {

		Car car = new Car();
		car.getPrice();
		car.getAirbagDetails();

		Bus bus = new Bus();
		bus.getPrice();
		bus.getAirbagDetails();
	}

}

interface Vehicle {
	public default void getAirbagDetails() {
		System.out.println("default method of Vehicle class..");
	}

	public void getPrice();
}

class Car implements Vehicle {

	public void getAirbagDetails() {
		System.out.println("Car's airbag details");
	}

	@Override
	public void getPrice() {
		System.out.println("Car's price is 4000$");
	}

}

class Bus implements Vehicle {

	public void getAirbagDetails() {
		System.out.println("Bus airbag details");
	}

	@Override
	public void getPrice() {
		System.out.println("Bus price is 9000$");
	}

}