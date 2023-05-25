package anand.learn.java8.lambda.set1;

public class MainMethod {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print();

        printThing(cat);
        Dog dog = new Dog();
        printThing(()-> System.out.println("Mew1"));

    }
    public static void printThing(Printable p) {
        p.print();
    }
}
