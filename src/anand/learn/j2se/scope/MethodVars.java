package anand.learn.j2se.scope;

public class MethodVars {
	int x = 3;

	public void goto1() {
		int x = 1; // error here local var must be initialized
		goto2(++x);
	}

	public void goto2(int s) {
		int x = ++s;
		System.out.println("Value is :" + x);
	}

	public static void main(String[] args) {
		new MethodVars().goto1();
	}
}
