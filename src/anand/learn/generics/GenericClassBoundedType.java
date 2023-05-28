package anand.learn.generics;

public class GenericClassBoundedType<T extends Number> {
	private T data;

	public GenericClassBoundedType(T data) {
		this.data = data;
	}
	
	public void printMethod() {
		System.out.println("Data is: "+ data);
	}
	
	public T getData() {
		return data;
	}
}
