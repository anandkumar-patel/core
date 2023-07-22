package anand.learn.inner;

class NestedInner {
	// Simple nested inner class
	class Inner {
		public void show() {
			System.out.println("In a nested class method");
		}
	}
}

public class MemberInnerDemo {
	public static void main(String[] args) {
		NestedInner.Inner in = new NestedInner().new Inner();
		in.show();
	}
}
