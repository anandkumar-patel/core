package anand.learn.java8.lib;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();
		Function<Integer, Integer> func2 = x -> x * 2;
        
		Integer apply = func.apply("AnandPatel"); //10
        System.out.println(apply);
        
        Integer result = func.andThen(func2).apply("AnandPatel");   // 20
        System.out.println(result);
	}

}
