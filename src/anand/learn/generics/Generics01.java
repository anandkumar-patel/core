package anand.learn.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics01 {

	public static void main(String[] args) {

		printElements01(new ArrayList<String>(Arrays.asList("anand", "patel"))); // OK
		printElements01(new ArrayList<Integer>(Arrays.asList(12, 13))); // OK
		printElements01(new ArrayList(Arrays.asList("anand", "patel"))); // OK


//		printElements02(new ArrayList<String>(Arrays.asList("anand", "patel"))); //NOT OK compile time error
//		printElements02(new ArrayList<Integer>(Arrays.asList(12, 13))); //NOT OK compile time error
//		printElements02(new ArrayList(Arrays.asList("anand", "patel"))); // OK
		
		
//		printElements03(new ArrayList<String>(Arrays.asList("anand", "patel"))); // OK
//		printElements03(new ArrayList<Integer>(Arrays.asList(12, 13))); // OK
//		printElements03(new ArrayList(Arrays.asList("anand", "patel"))); // OK

		
	}

	public static void printElements01(List listOfObjects) {
		System.out.println("printElements01() method called...");
		listOfObjects.add("abc"); // OK
		listOfObjects.add(101); // OK

		for (Object o : listOfObjects) {
			System.out.println(o); // OK
		}
	}
	
	public static void printElements02(List<Object> listOfObjects) {
		System.out.println("printElements02() method called...");
		listOfObjects.add("abc"); // OK
		listOfObjects.add(101); // OK

		for (Object o : listOfObjects) {
			System.out.println(o); // OK
		}
	}
	
	public static void printElements03(List<?> listOfUnknownType) {
		System.out.println("printElements03() method called...");
		//listOfUnknownType.add("abc"); // compile time error

		for (Object o : listOfUnknownType) {
			System.out.println(o); // OK
		}
	}
}