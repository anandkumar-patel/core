package anand.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapFilter {

	public static void main(String[] args) {

		//before java8
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    map.put(3, "anand.com");
	    map.put(4, "patel.com");
			
		String result = "";
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if("heroku.com".equals(entry.getValue())){
				result = entry.getValue();
			}
		}
		
		System.out.println("result is :"+result);
		
		
		
		//in java8
		String result1 = map.entrySet().stream().filter(x -> "heroku.com".equals(x.getValue())).map(x -> x.getValue())
				.collect(Collectors.joining());
		System.out.println("result in java8 is :" + result1);
		
		//Map -> Stream -> Filter -> MAP
		Map<Integer, String> collect = map.entrySet().stream()
			.filter(x -> x.getKey() > 1)
			.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		
		System.out.println("map data 1 :"+collect);
			
		// or like this -here replaced lambda with method reference
		Map<Integer, String> collect1 = map.entrySet().stream()
			.filter(x -> x.getKey() == 3)
			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("map data 2 :"+collect1);
		
		
		Map<Integer, String> filteredMap = filterByValue(map, x -> x.contains("anand"));
        System.out.println("filter map :"+filteredMap);
	}
	
	
	// Generic Map filterbyvalue, with predicate
    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(x -> predicate.test(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


}
