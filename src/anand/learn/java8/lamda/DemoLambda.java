package anand.learn.java8.lamda;

import java.util.stream.IntStream;

public class DemoLambda {
	
	public static void main(String[] args) {		
		int[] numbers = { 4, 1, 13, 90, 16, 2, 0 };
		System.out.println("Minimum is :" + IntStream.of(numbers).min().getAsInt()); // throw exception when array is empty
		System.out.print("Minimum is :");
		IntStream.of(numbers).min().ifPresent(System.out::println);
		
		//get the 3 distinct minimum number
		System.out.print("3 distinct minimum numbers are :");
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
	}

}
