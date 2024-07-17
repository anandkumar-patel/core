package anand.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {
	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList(
				Arrays.asList(1, 2, 3), 
				Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		// Using flatMap to flatten the nested lists into a single stream of integers
		List<Integer> flattenedList = nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

		// Printing the flattened list
		System.out.println("Flattened List: " + flattenedList);

		// Example of further operations after flatMap
		// Sum of all elements in the flattened list
		int sum = nestedList.stream().flatMap(list -> list.stream()).reduce(0, Integer::sum);

		System.out.println("Sum of all elements: " + sum);
	}

}
