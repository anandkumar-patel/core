package anand.learn.java8.lib;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Define a Supplier that generates a random number between 1 and 100
        Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100) + 1;

        // Get and print random numbers using the Supplier
        for (int i = 0; i < 5; i++) {
            int randomValue = randomNumberSupplier.get();
            System.out.println("Random Number: " + randomValue);
        }
    }
}
