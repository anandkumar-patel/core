package anand.learn.dp.factory.exmp1;

import java.io.*;

//Use the GetPlanFactory to get the object of concrete classes by 
//passing an information such as type(DOMESTICPLAN/COMMERCIALPLAN//
//INSTITUTIONALPLAN).
public class GenerateBill {

	public static void main(String args[]) throws IOException {

		GetPlanFactory planFactory = new GetPlanFactory();

		// get an object of DomesticPaln and call its getPlan()method.But we
		// want to calculate the bill for one plan at time not all.for this we
		// IO concept.

		System.out.print("Enter the name of plan for which the bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();

		System.out.print("Enter the number of units for bill will be calculated: ");

		int units = Integer.parseInt(br.readLine());

		Plan p = planFactory.getPlan(planName);

		// call getRate() method and calculateBill()method of DomesticPaln.

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);

	}
}
