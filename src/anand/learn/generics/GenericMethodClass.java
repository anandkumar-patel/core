package anand.learn.generics;

public class GenericMethodClass {

	public <T> void genericMethod(T data) {
		System.out.println("Generic method started......");
		System.out.println("Data is :"+data);
	}
	
	public <T extends Number> void genericMethodBoundedType(T data) {
		System.out.println("Generic method (bounded type) started......");
		System.out.println("Data is :"+data);
	}
}
