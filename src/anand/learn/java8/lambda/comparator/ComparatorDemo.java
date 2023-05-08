package anand.learn.java8.lambda.comparator;

import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator<Developer> sal =(d1,d2)->d1.getSalary().compareTo(d2.getSalary());
	}

}
