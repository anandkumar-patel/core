package anand.learn.java8.lib.flatmap;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestExample1 {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        
        
        
        Predicate<String[]> p = x-> x[0]=="a";

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

    }

}