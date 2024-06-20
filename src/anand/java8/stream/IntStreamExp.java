package anand.java8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author anandpatel
 *
 */
public class IntStreamExp {

	public static void main(String[] args) {
		// 1. Integer Stream
		IntStream.range(1, 10).forEach(i->System.out.print(i + " "));
		System.out.println();

		// 2. Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println();

		// 3. Integer Stream with sum
		System.out.println(IntStream.rangeClosed(1, 5).sum());
		System.out.println();
		
		Stream<Integer> stream1 = Stream.of(1,2,3);
	}
}
