package anand.learn.java8.lamda.sort;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		sortByAge(listDevs);
		
		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
	}
	
	private static void sortByAge(List<Developer> listDevs) {
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
	}
	
	private static void sortByName(List<Developer> listDevs) {
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}
	private static void sortBySalary(List<Developer> listDevs) {
		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
	}
	
	private static void shortByAgeInJava8(List<Developer> listDevs) {
		listDevs.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o2.getAge() - o1.getAge();
			}
		});
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;

	}
	
}