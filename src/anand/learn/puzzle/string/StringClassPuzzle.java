package anand.learn.puzzle.string;

public class StringClassPuzzle {

	public static void main(String[] args) {

		int a = 10 + 20;
		System.out.println(a);
	}

}

class String {
	private final String str;

	public String(String str) {
		this.str = str;
	}

}
/**
 *  It will throw exception because here main method parameter is string array, 
 *  but not java.lang.String.
 *  It's local defined String class instance.
 */
