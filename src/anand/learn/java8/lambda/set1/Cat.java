package anand.learn.java8.lambda.set1;

public class Cat implements Printable {
    String name;
    int age;

    @Override
    public void print() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
