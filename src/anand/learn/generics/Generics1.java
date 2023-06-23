package anand.learn.generics;

public class Generics1<T> {

    private T value;

    public Generics1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public <U> void printInfo(U info) {
        System.out.println("Value: " + value);
        System.out.println("Info: " + info);
    }

    public static void main(String[] args) {
    	Generics1<Integer> integerObj = new Generics1<>(10);
        integerObj.printInfo("This is a string");

        Generics1<String> stringObj = new Generics1<>("Hello");
        
        stringObj.printInfo(3.14);
        integerObj.printInfo(3.14);
    }
}
