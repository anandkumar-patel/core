package anand.exception.tricky;

public class Exception1 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println(2);
		}
	}
}

// catch (NullPointerException | NumberFormatException | Exception e) {