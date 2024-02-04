package anand.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExp {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("cherry","banana","apple","mango");
		
		Stream<String> myStream1 = list.stream();
		
		Stream<String> mySTream2 = Stream.of("data");
		
		Stream<String> mySTream3 = Stream.of("anand","kumar","patel");

		Stream<Integer> myStream4 = Stream.iterate(0, x->x*x).limit(5);
		
		Stream<Integer> myStream5 = Stream.generate(()-> 1).limit(6);
		myStream5.collect(Collectors.toList()).forEach(System.out::println);

		
		
		
	}
	
	public static void allCommonMethods() {
		
		List<Integer> collect = Stream.iterate(0, x->x+1).limit(101)
				.skip(1)
				.filter(x-> x%2==0)
				.map(x->x/10)
				.distinct()
				.sorted()
				.peek(x->System.out.println(x))
				.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
			
				
	}

}
