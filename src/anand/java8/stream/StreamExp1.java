package anand.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExp1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("cherry","banana","apple","mango");
		Stream<String> myStream1 = list.stream();
		myStream1.collect(Collectors.toList()).forEach(System.out::println);

		Stream<String> myStream2 = Stream.of("data");
		myStream2.collect(Collectors.toList()).forEach(System.out::println);

		Stream<String> myStream3 = Stream.of("anand","kumar","patel");
		myStream3.collect(Collectors.toList()).forEach(System.out::println);

		Stream<Integer> myStream4 = Stream.iterate(100, x->x+x).limit(5);
		myStream4.collect(Collectors.toList()).forEach(System.out::println);

		Stream<Double> myStream5 = Stream.generate(()-> Math.random()).limit(6);
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
