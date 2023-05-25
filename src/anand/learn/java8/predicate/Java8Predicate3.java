package anand.learn.java8.predicate;

import java.util.function.Predicate;

public class Java8Predicate3 {

    public static void main(String[] args) {

        Predicate<String> startWithA = x -> x.startsWith("a");
        Predicate<String> startWithm = x -> x.startsWith("m");

        // start with "a" or "m"
        boolean result = startWithA.or(startWithm).test("mkyong");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    // false

    }

}