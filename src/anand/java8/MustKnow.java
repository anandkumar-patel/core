package anand.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MustKnow {

	public static void main(String[] args) {

		// converting a int array to Integer List
		int[] arr = { 11, 12, 13, 14, 15 };
		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list.size());
		
		//converting string array to comma separated string 
		List<String> input = Arrays.asList("anand","kumar","patel");
		String output = String.join(",", input);
		System.out.println(output);
		
		// Creating a list with a default value and size
		int size = 10;
		int defaultValue = 2;
		List<Integer> list1;
		Integer[] arr1 = new Integer[size];
		Arrays.fill(arr1, defaultValue);
		list1 = Arrays.asList(arr1);
	}
}
