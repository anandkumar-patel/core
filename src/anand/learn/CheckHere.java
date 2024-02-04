package anand.learn;

public class CheckHere {

	public static void main(String[] args) {

	}
}

@FunctionalInterface
interface Parent {
	public String getName();

	public default void sayHello() {
		System.out.println("Parent says hello");
	}
}