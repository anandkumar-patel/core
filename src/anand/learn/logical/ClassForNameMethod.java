package anand.learn.logical;

class Test {
	static {
		System.out.println("this is static block of test");
	}

	Test() {
		System.out.println("this is test constructor");
	}
}

public class ClassForNameMethod {
	public static void main(String[] args) throws Exception {
		Test t = new Test();
		System.out.println("start of demo");
		Class c = Class.forName("core.anand.logical.Test");
		System.out.println("class test loaded");
		Test obj = (Test) c.newInstance();// create an instance
	}
}
/**
 * Class.forName("X") loads the class if it not already loaded. If the class is
 * already loaded then it does not do anything
 */
