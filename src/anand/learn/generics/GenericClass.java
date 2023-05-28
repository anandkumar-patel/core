package anand.learn.generics;

public class GenericClass<T> {
	private String dataType;
	private T data;
	public GenericClass(T data,String dataType) {
		this.data = data;
		this.dataType = dataType;
	}
	
	public void printMethod() {
		System.out.println("Data is: "+ data+" and type is :"+ dataType);
	}

}
