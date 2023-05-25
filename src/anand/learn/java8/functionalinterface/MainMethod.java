package anand.learn.java8.functionalinterface;

public class MainMethod {

	public static void main(String[] args) {
		// Implementing Arithmetic interface without using Lambda expression
		Arithmetic obj = new Arithmetic() {
			@Override
			public int operation(int x, int y) {
				return x + y;
			}
		};

		System.out.println(obj.operation(11, 13));
		System.out.println(obj.sum(11, 13));
		System.out.println(Arithmetic.mul(5, 6));

		// Implementing Arithmetic interface using Lambda expression
		Arithmetic obj1 = (int a, int b) -> a / b;

		System.out.println(obj1.operation(11, 13));
		System.out.println(obj1.sum(11, 13));
	}
}
