package anand.learn.construt;

class Base {
	public Base() {
		System.out.println("Base class default Constructor");
	}

	public Base(String value) {
		System.out.println("Base class param Constructor " + value);
	}
}

class DerivedClass extends Base {
	public DerivedClass() {
		System.out.println("Derived class default constructor");
	}

	public DerivedClass(String parama) {
		System.out.println("Derived class param constructor " + parama);
	}
}

public class CallHirerchy {

	public static void main(String[] args) {
		// new DerivedClass(); // base-default, derived default
		// new DerivedClass("Hiiiiii");//base-default, derived parameterized
	}

}
