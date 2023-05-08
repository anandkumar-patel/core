package anand.learn.exception;

public class CatchCheckedExp {
	public static void main(String[] args) {
		try {
			System.out.println("I am in try block");
		}
		//uncomment it
		//catch (FileNotFoundException a) { // will not compile
		//}
		catch (RuntimeException a) { // will compile
		}
	}

}
/*
If a method not throwing a checked exception we can't catch it. ex-File....

But for unchecked exception its valid

*/
