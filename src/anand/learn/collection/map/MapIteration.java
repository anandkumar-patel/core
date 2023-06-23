package anand.learn.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		System.out.println("Looping map in noraml ways : if key value both required");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		Iterator<Map.Entry<String, Integer>> itr = items.entrySet().iterator();
		
		
		System.out.println("Looping map by iterator : if key value both required");
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		System.out.println("Looping map : if only key required");
		for(String key :items.keySet()) {
			System.out.println("Key = " + key);
		}
		
		System.out.println("Looping map : if only values required");
		for(Integer value :items.values()) {
			System.out.println("Value = " + value);
		}
		
		System.out.println("Looping map : using key get the value");
		for(String key :items.keySet()) {
			Integer value = items.get(key);
			System.out.println("Key = " + key + ", Value = " + value);
		}
		
	}

}
