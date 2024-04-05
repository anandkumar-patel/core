package anand.learn.inherit;

class Test1 {
	static {
		System.out.println("Test1 static block called...");
	}
	{
		System.out.println("Test1 instance initializer block called...");
	}
	Test1(int x) {
		System.out.println("Test1 constructor called " + x);
	}
}

public class Test2 {
	Test1 t1 = new Test1(10);
	static {
		System.out.println("Test2 static block called...");
	}
	{
		System.out.println("Test2 instance initializer block called...");
	}

	Test2(int i) {
		System.out.println("Test2 constructor called...");
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2(5);
	}
}
/**
 * First static block get executed then class variable get instantiated i.e.
 * new Test1(10); 
 * After these Constructor of Test2 (parameterized) is get
 * execute, in this constructor Test1 is get instantiated.
 */
