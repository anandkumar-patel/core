package anand.learn.construt;

//filename: Test2.java
class Test1 {
	Test1(int x) {
		System.out.println("Constructor called " + x);
	}
}

// This class contains an instance of Test1
public class Test2 {
	Test1 t1 = new Test1(10);
	static {
		System.out.println("Static Block");
	}

	Test2(int i) {
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2(5);
	}
}
/**
 * First static method get executed then class variable get instantiated i.e.
 * new Test1(!0); After these Constructor of Test2 (parameterized) is get
 * execute, in this constructor Test1 is get instantiated.
 */
