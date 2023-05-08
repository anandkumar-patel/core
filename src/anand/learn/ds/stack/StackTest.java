package anand.learn.ds.stack;

public class StackTest {
	enum Size {
		SMALL, MEDIUM, LARGE;
	}

	public static void main(String[] args) {

		Size size = Size.SMALL; // line n1
		switch (size) { // line n2
		case SMALL: {
			System.out.print(size);
		} // line n3
		}

		StackInterface<Integer> intStack = new CustomStack<>();
		intStack.push(11);
		intStack.push(12);
		intStack.push(13);
		System.out.println("intStack :" + intStack.toString());

		StackInterface<String> stringStack = new CustomStack<>();
		stringStack.push("anand");
		stringStack.push("kumar");
		stringStack.push("patel");
		System.out.println("stringStack :" + stringStack.toString());

	}

}
