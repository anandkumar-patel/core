package anand.learn.java8.lib;

import java.util.Optional;

/**
 * @author anandpatel
 * 
 * Optional is a container object which may or may not contain a non-null value. 
 * You must import java.util package to use this class. 
 * If a value is present, isPresent() will return true and get() will return the value. 
 * 
 * Additional methods that depend on the presence or absence of a contained value are provided, 
 * such as orElse() which returns a default value if value not present and 
 * ifPresent() which executes a block of code if the value is present. *
 *
 *	Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.
 *	
 *	Optionaal.empty() method is useful to create an empty Optional object.
 *
 *	Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.
 *
 * 	Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.
 * 
 * 		
 */
public class OptionalDemo {

	public static void main(String[] args) {
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		if (checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.print(word);
		} else
			System.out.println("word is null");
	}
}
