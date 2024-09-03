package anand.generics;

public class Generics03ClassUpperBounded<T extends Number> {
	private T data;

	public Generics03ClassUpperBounded(T data) {
		this.data = data;
	}
	
	public void printMethod() {
		System.out.println("Data type : "+ data.getClass());
	}
	
	public T getData() {
		return data;
	}
	
	public static void main(String[] args) {
		System.out.println("*** generic class with upper-bounded data type ***");
		Generics03ClassUpperBounded<Integer> intDataObj = new Generics03ClassUpperBounded<Integer>(15);
		intDataObj.printMethod();

		Generics03ClassUpperBounded<Double> doubleObj = new Generics03ClassUpperBounded<Double>(234.56);
		doubleObj.printMethod();
		
		Generics03ClassUpperBounded obj = new Generics03ClassUpperBounded(15);
		obj.printMethod();
		
		// Generics03ClassUpperBounded<String> strinDataObj = new Generics03ClassUpperBounded<String>("Hello");
	}
}
