package anand.learn.java8;

import java.util.*;
import java.util.stream.IntStream;

public class HashMapDemo {
	
	public static void main(String[] args) {
		createMap();
		
	}
	
	
	public static void createMap() {
		Map<String, Integer> collect = IntStream.range(0, 10).collect(HashMap<String, Integer>::new,
				(m, v) -> m.put(UUID.randomUUID().toString(), m.size()), (m, m2) -> {
				});

		collect.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		List<Integer> collect1 = IntStream.range(0, 10).collect(ArrayList<Integer>::new, (m, v) -> m.add(m.size()),
				(m, m2) -> {
				});
		collect1.forEach((m) -> System.out.println(m));
	}

}
