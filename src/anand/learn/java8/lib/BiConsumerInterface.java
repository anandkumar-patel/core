package anand.learn.java8.lib;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer; 
  
public class BiConsumerInterface { 
    public static void main(String args[]) 
    { 
  
        List<Integer> lista = Arrays.asList(2,1,3);
        List<Integer> listb = Arrays.asList(2,1,9);

  
        // BiConsumer to compare both lists 
		BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {
			if (list1.size() != list2.size()) {
				System.out.println("False");
			} else {
				for (int i = 0; i < list1.size(); i++)
					if (list1.get(i) != list2.get(i)) {
						System.out.println("False");
						return;
					}
				System.out.println("True");
			}
		};
		
        //equals.accept(lista, listb); 
		
		// BiConsumer to print 2 lists
		BiConsumer<List<Integer>, List<Integer>> disp = (list1, list2) -> {
			list1.stream().forEach(a -> System.out.print(a + " "));
			System.out.println();
			list2.stream().forEach(a -> System.out.print(a + " "));
			System.out.println();
		};

		// Using addThen() method
		equals.andThen(disp).accept(lista, listb);
		
		
		
    } 
}