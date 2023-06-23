package anand.learn.passby;

public class PassByReference {

	public static void main(String args[]) {
		Animal a = new Animal("Lion");

		System.out.println("Before Modify: " + a);
		modify(a);
		System.out.println("After Modify: " + a);
	}

	public static void modify(Animal animal) {
		animal.setName("Tiger");
	}

}
