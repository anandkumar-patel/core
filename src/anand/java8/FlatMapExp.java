package anand.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExp {
	public static void main(String[] args) {
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("Anand", "Patel", "Two"), 
				Arrays.asList("Urmila", "JI", "Seven"),
				Arrays.asList("Sur", "Sarojani", "Ten"));

		// Using flatMap to flatten the nested lists into a single stream of String
		List<String> flattenedList = nestedList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println("Flattened List: " + flattenedList);
		
		//
		List<String> lower = nestedList.stream().flatMap(list-> list.stream().map(s-> s.toLowerCase())).collect(Collectors.toList());
		System.out.println("Flattened List{ lower }: " + lower);
		
		
		Map<String,List<String>> mapObj = new HashMap<>();
	
	}
}
