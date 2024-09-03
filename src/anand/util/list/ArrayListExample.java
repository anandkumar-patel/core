package anand.util.list;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String args[]) {
		/*
		 * Creation of ArrayList: I'm going to add String elements so I made it of
		 * string type
		 */
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Harry");

		System.out.println("Current array list is:" + obj);

		/* Remove element from the given index */
		obj.remove(1);

		System.out.println("Current array list is:" + obj);

		ArrayList<Integer> obj1 = new ArrayList<>();

		/* This is how elements should be added to the array list */
		obj1.add(5);
		obj1.add(3);
		obj1.add(2);
		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + obj1);
		obj1.remove(new Integer(2));
		obj1.remove(2);
		System.out.println("Current array list is:" + obj1);

	}
}
