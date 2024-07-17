package anand.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMethods {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11);

		// Partition numbers into even and odd using Collectors.partitioningBy
		Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		List<Integer> evenList = evenOddMap.get(true);
		List<Integer> oddList = evenOddMap.get(false);
		System.out.println("even list :" + evenList);
		System.out.println("odd list :" + oddList);

		Map<Boolean, Long> countMap = numbers.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.counting()));
		System.out.println("even count :" + countMap.get(true));
		System.out.println("odd count :" + countMap.get(false));
		
		/*
		 * Map<Boolean, Optional<Integer>> sumMap = numbers.stream()
		 * .collect(Collectors.partitioningBy(n -> n % 2 == 0,
		 * Collectors.reducing(null))); System.out.println("even count :" +
		 * sumMap.get(true)); System.out.println("odd count :" + sumMap.get(false));
		 */
		
		
		
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        // Group names by their length using Collectors.groupingBy
        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(namesByLength);
        
		// Group names by their length and count them
		Map<Integer, Long> namesByLengthCount = names.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(namesByLengthCount);

	}
}
