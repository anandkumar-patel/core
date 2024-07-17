package anand.java8.util.optional;

import java.util.Optional;

public class OptionalExp {

	public static void main(String[] args) {
		// creating empty optional
		Optional<String> obj1 = Optional.empty();
		obj1.ifPresent(val -> System.out.println("valie is :" + val));

		Optional<String> obj2 = Optional.of("anand"); // passing null will throw exception
		obj2.ifPresent(System.out::println);

		Optional<String> obj3 = Optional.ofNullable(null); // passing null is ok
		obj3.ifPresent(val -> System.out.println("valie is :" + val));

		// String[] words = new String[5];
		String[] words = { "Anand", "Kumar", null, "SURYA", "ananya" };
		Optional<String> checkNull = Optional.ofNullable(words[2]);
		if (checkNull.isPresent()) {
			String word = words[2].toLowerCase();
			System.out.print(word);
		} else {
			System.out.println("word is null");
		}

		// java-9 enhancement
		Optional<String> obj4 = Optional.ofNullable(null);
		// ifPresentOrElse()
		obj4.ifPresentOrElse(System.out::println, () -> System.out.println("Value not present"));
		// or()
		Optional<String> fallback = obj4.or(() -> Optional.of("and take this value"));

		fallback.ifPresent(System.out::println);
		// stream()
		fallback.stream().filter(value -> value.startsWith("an")).forEach(System.out::println);

		// java-10 enhancement
		// var
		var optional = Optional.of("Hello, Java 10!");
		optional.ifPresent(System.out::println);

		// java-11 enhancement
		// isEmpty()
		if (optional.isEmpty()) {
			System.out.println("Value is not present");
		} else {
			System.out.println("Value is present");
		}

	}

}
