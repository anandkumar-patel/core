package anand.autoboxing;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalExp {

	public static void main(String args[]) throws IOException {

		// floating point calculation
		double amount1 = 2.15;
		double amount2 = 1.10;
		System.out.println("difference between 2.15 and 1.0 using double is: " + (amount1 - amount2));

		// Use BigDecimal for financial calculation
		BigDecimal amount3 = new BigDecimal("2.15");
		BigDecimal amount4 = new BigDecimal("1.10");
		System.out.println("string arg constructor : difference between 2.15 and 1.0 using BigDecimal is: " + (amount3.subtract(amount4)));
	
	
		 //Creating BigDecimal from double values
		BigDecimal amount5 = new BigDecimal(2.15);
		BigDecimal amount6 = new BigDecimal(1.10) ;
		System.out.println("double arg constructor : difference between 2.15 and 1.0 using BigDecmial is: " + (amount5.subtract(amount6)));
	}
}