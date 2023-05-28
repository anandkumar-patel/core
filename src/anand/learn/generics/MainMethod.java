package anand.learn.generics;

public class MainMethod {

	public static void main(String[] args) {
		// simple generic class
		System.out.println("simple generic class");
		GenericClass<String> stringDataObj = new GenericClass<String>("Hello", "string");
		stringDataObj.printMethod();

		GenericClass<Integer> integerDataObj = new GenericClass<Integer>(15, "integer");
		integerDataObj.printMethod();

		// generic class with bounded data type
		System.out.println("generic class with bounded data type");
		GenericClassBoundedType<Integer> intDataObj = new GenericClassBoundedType<Integer>(15);
		intDataObj.printMethod();

		GenericClassBoundedType<Double> doubleObj = new GenericClassBoundedType<Double>(234.56);
		doubleObj.printMethod();
		
		// 
		GenericClassBoundedType Obj = new GenericClassBoundedType(15);
		Number data = Obj.getData();
		System.out.println(data);
		
		//GenericClassBoundedType<String> strinDataObj = new GenericClassBoundedType<String>("Hello");

		
		// simple generic method
		System.out.println("simple generic method");
		GenericMethodClass obj = new GenericMethodClass();
		obj.genericMethod(13);
		obj.genericMethod("String data");
		
		
		// generic method with bounded data type
		System.out.println("generic method with bounded data type");
		obj.genericMethodBoundedType(13);
		obj.genericMethodBoundedType(13.5);
		//obj.genericMethodBoundedType("String data");

	}

}

