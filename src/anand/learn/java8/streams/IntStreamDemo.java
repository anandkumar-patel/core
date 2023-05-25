package anand.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * In this example we sum the element greater than 15 using stream.
 * 
 * @author anandpatel
 *
 */
public class IntStreamDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(11, 12, 3, 8, 15);
		System.out.println(sumStream(input));

		Stream<Integer> stream = getStreamFromList(input);
		List<Integer> output = getListFromStream(stream);
		System.out.println(output.toString());

		Stream<Integer> stream1 = getStreamFromList(input);
		Integer[] arrOutput = getArrayFromStream(stream1);
		for (int i = 0; i < arrOutput.length; i++) {
			System.out.print(arrOutput[i] + " ");
		}
		System.out.println("Iterating list of map");
		streamWithMap();
		
		System.out.println("matching in stream");
		streamMatch();
		
		convertIntStreamToInt();
	}
	
	//convert IntStream to int or int[]
	private static void convertIntStreamToInt() {
		System.out.println("******** convertIntStreamToInt() started   *******");
		int[] num = { 1, 2, 3, 4, 5 };

		// 1. int[] -> IntStream
		IntStream stream = Arrays.stream(num);
		// 2. OptionalInt
		OptionalInt first = stream.findFirst();
		// 3. getAsInt()
		int result = first.getAsInt();
		System.out.println(result); // 1

		// one line
		System.out.println(Arrays.stream(num).findFirst().getAsInt()); // 1

		// filter
		stream = Arrays.stream(num);
		OptionalInt any = stream.filter(x -> x % 2 == 0).findAny();
		result = any.getAsInt();
		System.out.println(result); // 2 or 4

		stream = Arrays.stream(num);

		// IntStream -> int[]
		int[] ints = stream.toArray();
		System.out.println("int array from IntStream :");
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println("");
		stream = Arrays.stream(num);
		// IntStream -> Integer[]
		Integer[] integers = stream.boxed().toArray(Integer[]::new);
		System.out.println("int array from IntStream :" + integers);
		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + " ");
		}
		System.out.println("");

		System.out.println("******** convertIntStreamToInt() ended   *******");
	}

	private static int sumStream(List<Integer> input) {
		return input.stream().filter(i -> i > 10).mapToInt(i -> i).sum();

	}

	public static Stream<Integer> getStreamFromList(List<Integer> list) {
		return list.stream().filter(i -> i > 10);
	}

	private static List<Integer> getListFromStream(Stream<Integer> stream) {
		return stream.collect(Collectors.toList());
	}

	private static Integer[] getArrayFromStream(Stream<Integer> stream) {
		return stream.toArray(Integer[]::new);
	}

	private static void streamWithMap() {
		List<Map<String, String>> listOfMap = new ArrayList<>();
		Map<String, String> map1 = new HashMap<>();
		map1.put("key1", "value11");
		map1.put("key2", "value12");
		map1.put("key3", "value13");
		listOfMap.add(map1);
		Map<String, String> map2 = new HashMap<>();
		map2.put("key1", "value21");
		map2.put("key3", "value23");
		listOfMap.add(map2);
		Map<String, String> map3 = new HashMap<>();
		map3.put("key2", "value32");
		map3.put("key3", "value33");

		listOfMap.add(map3);
		
		listOfMap.stream().filter(x->x.containsKey("key2")).map(x->x.get("key2")).forEach(x->System.out.print(x+ " "));

	}
	
	private static void streamMatch() {
	
		List<Integer> input = Arrays.asList(11, 12, 13, 18, 15,30);
		//no match
		boolean isNoMatch = input.stream().noneMatch(i->i>20);
		System.out.println("no match :"+isNoMatch);
		//anymatch
		boolean isAnyMatch = input.stream().anyMatch(i->i>20);
		System.out.println("is any match :"+isAnyMatch);
		
		//all match
		boolean isAllMatch = input.stream().allMatch(i->i>10);
		System.out.println("all match :"+isAllMatch);
		
		
	}
	
}
