package anand.learn.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		printElements(new ArrayList<String>()); // OK
		printElements(new ArrayList<Integer>()); // OK

		//printObjects(new ArrayList<String>()); //NOT OK compile time error
		//printObjects(new ArrayList<Integer>()); //NOT OK compile time error
	}

	public static void printElements(List<?> listOfUnknownType) {
		//listOfUnknownType.add("abc"); // compile time error

		for (Object o : listOfUnknownType) {
			System.out.println(o); // OK
		}
	}

	public static void printObjects(List<Object> listOfObjects) {
		listOfObjects.add("abc"); // OK
		listOfObjects.add(101); // OK

		for (Object o : listOfObjects) {
			System.out.println(o); // OK
		}
	}
}