package anand.learn.java8;

import java.util.stream.IntStream;

public class LambdaDemo {

    public static void main(String[] args) {

        //without lambda expression
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method ");
            }
        };
        Thread t = new Thread(obj);
        t.start();

        //with lambda expression
        Runnable obj1 = ()->System.out.println("run method");
        Thread t1 = new Thread(obj1);
        t1.start();
        System.out.println("end of main method");


        int[] numbers = { 4, 1, 13, 90, 16, 2, 0 };
        System.out.println("Minimum is :" + IntStream.of(numbers).min().getAsInt()); // throw exception when array is empty
        System.out.print("Minimum is :");
        IntStream.of(numbers).min().ifPresent(System.out::println);

        //get the 3 distinct minimum number
        System.out.print("3 distinct minimum numbers are :");
        IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
    }
}
