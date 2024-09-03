package anand.passby;

public class MainClass {
	public static void main(String[] args) {
		PassByObject f = new PassByObject("f");
		changeReference(f); // It won't change the reference!
		modifyReference(f); // It will change the object that the reference variable "f" refers to!
	}

	public static void changeReference(PassByObject a) {
		PassByObject b = new PassByObject("b");
		a = b;
	}

	public static void modifyReference(PassByObject c) {
		c.setAttribute("c");
	}
}
