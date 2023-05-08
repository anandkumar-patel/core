package anand.learn.inherit;

class BaseClass {

	public void func() {

		System.out.println("In Base Class func method !!");
	};
}

class DerivedClass extends BaseClass {

	public void func() { // Method Overriding

		System.out.println("In Derived Class func method");
	}

	public void func2() { // How to access this by Base class reference

		System.out.println("In Derived Class func2 method");
	}
}

public class InheritDemo {

	public static void main(String[] args) {

		BaseClass Base = new DerivedClass();
		// base.func2(); // <--- Can I access this ??? This is the issue...
	}
}
