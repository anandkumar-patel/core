package anand.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import anand.java8.Employee;

public class CheckHere {

	public static void main(String[] args) {
		list2map();
	}
	
	
	private static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1112, "Anand", 1234L, true));
		empList.add(new Employee(1113, "Patel", 1245L, true));
		empList.add(new Employee(1114, "Kumar", 2123L, false));
		empList.add(new Employee(1115, "Yas", 3421L, false));
		empList.add(new Employee(1116, "Singh", 1428L, true));
		empList.add(new Employee(1117, "Yadav", 2534L, true));
		empList.add(new Employee(1118, "Udham", 2495L, true));
		empList.add(new Employee(1119, "Singh", 1923L, false));
		empList.add(new Employee(1120, "Brijesh", 3242L, false));
		empList.add(new Employee(1121, "Patel", 1258L, true));
		return empList;
	}
	public static void positionOfVowelsInString() {

		String input = "Hello, WorldO!";
		// Get the positions of vowels using Java 8 streams
		List<Integer> vowelPositions = IntStream.range(0, input.length())
				.filter(i -> "aeiouAEIOU".indexOf(input.charAt(i)) != -1) // Filter out positions with vowels
				.boxed().collect(Collectors.toList());

		// Print the positions of vowels
		System.out.println("Positions of vowels in the string:");
		vowelPositions.forEach(position -> System.out.println(position));

	
	}

	public static void list2map() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Anand"));
		persons.add(new Person(2, "Kumar"));
		persons.add(new Person(3, "Patel"));
		persons.add(new Person(4, "Urmila"));
		persons.add(new Person(5, "Ananya"));
		persons.add(new Person(6, "Surya"));
		
		
		// way-1
		Map<Integer,Person> map1 = new HashMap<Integer, Person>();
		persons.forEach(e->map1.put(e.getId(), e));
		
		for(Integer key : map1.keySet()) {
			System.out.println(map1.get(key));
		}
		
		// way-2
		Map<Integer,String> map2 = persons.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		for(Integer key : map2.keySet()) {
			System.out.println(map2.get(key));
		}
	}

	public static void hashmapAll() {
		// Using HashMap as general purpose single threaded cache
		Map<Integer, String> cache = new HashMap<>();
		cache.put(1, "Stuart");
		cache.put(3, "James");
		cache.put(4, "Ian");
		cache.put(2, "Steven");
		System.out.printf("Name of Employee with id %d is %s %n", 1, cache.get(1));
		System.out.println("Order of Entries in HashMap - Not guaranteed");
		System.out.println(cache);

		// Using TreeMap to create a sorted cache, sorting keys on reverse order
		SortedMap<Integer, String> sortedCache = new TreeMap<>(Collections.reverseOrder());
		sortedCache.putAll(cache);
		System.out.println("Order of Entries in TreeMap - Sorted in reverse order");
		System.out.println(sortedCache);

		// Using LinkedHashMap to create copy of a Map in Java
		Map<Integer, String> copy = new LinkedHashMap<>(sortedCache);
		System.out.println("Order of Entries in a copy Map created by LinkedHashMap");
		System.out.println(copy);
	}
}

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + id + " : " + name + "]";
	}
}
