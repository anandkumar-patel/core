package anand.learn.inner;

class Outer {
	void outerMethod() {
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
		abstract class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		class Inner2 extends Inner
		{
			
		}
		Inner y = new Inner2();
		y.innerMethod();
	}
}
public class MethodLocalInnerDemo  {
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}
