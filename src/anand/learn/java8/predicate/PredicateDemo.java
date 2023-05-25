package anand.learn.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> noGreaterThan5 =  x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;
		
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        System.out.println("Predicate in filter()");
        //Predicate in filter()
        List<Integer> collect = list.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]
        
        System.out.println("Predicate.and()");
        //Predicate.and()
        List<Integer> collect1 = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());

        System.out.println(collect1);
        
        
        System.out.println("Predicate.or()");
        //Predicate.and()
        List<Integer> collect2 = list.stream()
                .filter(noGreaterThan5.or(noLessThan8))
                .collect(Collectors.toList());

        System.out.println(collect2);
        
        
        System.out.println("Predicate.negate()");
		Predicate<Integer> neg = noGreaterThan5.negate();
		 List<Integer> collect3 = list.stream()
	                .filter(neg)
	                .collect(Collectors.toList());

	        System.out.println(collect3);
	}

}
