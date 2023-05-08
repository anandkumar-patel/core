package anand.learn.inner.innerInterface;

class Outer1 {
	interface Inner1 // nested interface is public by default and need not be
						// static
	{ // nested interface can be any access specifier and must be static
		public abstract void display(); // interface method
	}
}

public class Test implements Outer1.Inner1 {
	public void display() {
		System.out.println("Hello 1");
	}

	public static void main(String args[]) {
		Test t1 = new Test();
		t1.display();
	}
}
