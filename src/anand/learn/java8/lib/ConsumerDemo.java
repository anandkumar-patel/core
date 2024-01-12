package anand.learn.java8.lib;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Define a Consumer to add elements to the list
        Consumer<Integer> addToList = number -> numbers.add(number);

        // Add elements to the list using the Consumer
        addToList.accept(10);
        addToList.accept(20);
        addToList.accept(30);

        // Use a Consumer to print the elements in the list
        Consumer<Integer> printElement = number -> System.out.println("Element: " + number);

        // Iterate through the list and print each element
        numbers.forEach(printElement);
    }
}
