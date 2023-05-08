package anand.learn.solution;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal data1 = new BigDecimal("15.12");
		BigDecimal data2 = new BigDecimal("15.00");
		
		//BigDecimal data3 =data1.multiply(data2);
		//System.out.println("Data 3 :"+data3);
		
		
		data2 = data2.multiply(data1);
		System.out.println("Data 2 :"+data2);
	}
}
