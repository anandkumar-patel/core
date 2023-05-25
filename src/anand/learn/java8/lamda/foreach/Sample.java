package anand.learn.java8.lamda.foreach;

import java.util.Arrays;
import java.util.List;
/*after 1 hour start video of subramnyam*/
public class Sample {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//parameter as an argument to instance method
		System.out.println("**parameter as an argument to instance method**");
		input.forEach(System.out::println);
		
		//parameter as an argument to static method
		System.out.println("**parameter as an argument to static method**");
		input.stream().map(String::valueOf).forEach(System.out::println);
		
		//parameter as target
		System.out.println("**parameter as target**");
		input.stream().map(e->String.valueOf(e)).map(String::toString).forEach(System.out::println);
		
		
	}

}
