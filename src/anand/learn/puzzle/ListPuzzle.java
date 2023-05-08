package anand.learn.puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPuzzle {
	public static void main(String args[]) {
		List<String> circus1 = new ArrayList<String>();
		circus1.add("Monkey");
		circus1.add("Elephant");

		List<String> zoo1 = new ArrayList<String>(circus1);
		zoo1.add("Lion");
		//zoo1.remove(1);
		System.out.println("zoo1 size: " + zoo1.size());

		String[] circus2 = { "Monkey", "Elephant" };

		List<String> zoo2 = Arrays.asList(circus2);
		//zoo2.add("Tiger");
		//zoo2.remove(1);
		System.out.println("zoo2 size: " + zoo2.size());
	}
}
/**
 * Arrays.asList(<array>) returns a fixed-size list backed by the specified array.So we can't add and delete
 * this list data, so it's size is fixed.
 */
