package anand.learn;

import java.math.BigDecimal;

public class BigDecimalCompareDemo {

	public static void main(String[] args) {
		BigDecimal digit1=new BigDecimal(-12);
		BigDecimal digit2=new BigDecimal(1234.56);
		System.out.println(digit1.compareTo(BigDecimal.ZERO)!=0);
		System.out.println(digit1.compareTo(digit2));							
		
		Object demo= new Integer(10);
		BigDecimal medicine_quantity=(BigDecimal)demo;
		System.out.println("Values  :"+medicine_quantity);

	}

}
