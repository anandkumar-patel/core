package anand.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class CheckHere {

	public static void main(String[] args) {

		HashSet shortSet = new HashSet();
		for (short i = 0; i < 10; i++) {
			shortSet.add(i);
			boolean removed = shortSet.remove((short)(i - 1));
			System.out.println(removed);
		}
		System.out.println(shortSet.size());

		HashMap<String, String> map = new HashMap<>() {
			{
				put("1", "ONE");
			}
			{
				put("2", "TWO");
			}
			{
				put("3", "THREE");
			}
		};
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string + " ->" + map.get(string));
		}
	}

	public static void list2map() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Anand"));
		persons.add(new Person(2, "Kumar"));
		persons.add(new Person(3, "Patel"));
		persons.add(new Person(4, "Urmila"));
		persons.add(new Person(5, "Ananya"));
		persons.add(new Person(6, "Surya"));

		persons.forEach(e -> System.out.print(e.toString()));
		Map<Integer, Person> pMap = new HashMap<>();
		for (Person p : persons) {
			pMap.put(p.getId(), p);
		}
		for (int i : pMap.keySet()) {
			System.out.println(pMap.get(i).toString());
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
