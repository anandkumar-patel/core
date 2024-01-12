package anand.learn.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> numberGreaterThan5 = x -> x > 5;
		Predicate<Integer> nnumberLessThan8 = x -> x < 8;

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Predicate in filter()");
		List<Integer> collect = list.stream().filter(numberGreaterThan5).collect(Collectors.toList());
		System.out.println(collect); // [6, 7, 8, 9, 10]

		System.out.println("Predicate.and()");
		List<Integer> collect1 = list.stream().filter(numberGreaterThan5.and(nnumberLessThan8))
				.collect(Collectors.toList());
		System.out.println(collect1);

		System.out.println("Predicate.or()");
		List<Integer> collect2 = list.stream().filter(numberGreaterThan5.or(nnumberLessThan8))
				.collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println("Predicate.negate()");
		Predicate<Integer> neg = numberGreaterThan5.negate();
		List<Integer> collect3 = list.stream().filter(neg).collect(Collectors.toList());
		System.out.println(collect3);

		System.out.println("Predcate test() method use");
		boolean result1 = numberGreaterThan5.or(nnumberLessThan8).test(76);
		System.out.println(result1);

		System.out.println("pre-defined Predicate and on-spot created Predicate use");
		boolean result2 = numberGreaterThan5.and(x -> x < 8).test(76);
		System.out.println(result2);

	}

}
