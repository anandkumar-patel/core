package anand.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {
	public static void main(String[] args) {
		
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("Anand", "Patel", "Two"),
				Arrays.asList("Urmila", "Nirmala", "SEVEN"), Arrays.asList("surya", "Sarojani", "Ten"));
		
		// Using flatMap to flatten the nested lists into a single stream of String
		List<String> flattenedList = nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Flattened List: " + flattenedList);

		//
		List<String> lower1 = nestedList.stream().flatMap(list -> list.stream().map(s -> s.toLowerCase()))
				.collect(Collectors.toList());
		System.out.println("Flattened List{ lower }: " + lower1);
		
		List<String> lower2 = nestedList.stream().flatMap(list -> list.stream())
				.map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println("Flattened List{ lower }: " + lower2);

		List<List<Employee>> empList = Arrays.asList(
				Arrays.asList(new Employee(1112, "anand", 4454L, true), new Employee(1113, "uday", 7865L, false)),
				Arrays.asList(new Employee(1114, "kumar", 6284L, false), new Employee(1115, "singh", 8945L, true)),
				Arrays.asList(new Employee(1116, "patel", 1874L, true), new Employee(1117, "raman", 9345L, true)));

		
		empList.stream().flatMap(list->list.stream());
	}
}
