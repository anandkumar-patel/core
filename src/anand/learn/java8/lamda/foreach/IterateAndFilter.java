package anand.learn.java8.lamda.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateAndFilter {

	public static void main(String[] args) {
		
		IterateAndFilter obj = new IterateAndFilter();
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("F", 60);
		
		

		
		obj.loopList(list);
		obj.filterAndIterateList(list);
		obj.loopMap(map);

	}

	public void loopList(List<String> items) {
		
		System.out.println("Looping list in java8:");
		items.forEach(item -> System.out.println(item));


		// method reference
		// method reference is denoted by :: (double colon) operator
		System.out.println("Looping list in java8 way2:");
		items.forEach(System.out::println);
	}
	
	public void filterAndIterateList(List<String> items) {
		// Stream and filter
		// Output : B
		System.out.println("Looping list in java8 and filter:");
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}
	
	public void loopMap(Map<String, Integer> items) {		

		// In Java 8, you can loop a Map with forEach + lambda expression.
		System.out.println("Looping map in java8 ways1 :");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		System.out.println("Looping map in java8 ways2 :");
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}
}
