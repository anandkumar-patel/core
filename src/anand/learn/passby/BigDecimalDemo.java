package anand.learn.passby;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {

		BigDecimal amount=new BigDecimal(3000.00);
		BigDecimal docAmount=new BigDecimal(600.00);
		BigDecimal prescribingDocAmount=new BigDecimal(20.00);
		BigDecimal referalAmount=new BigDecimal(0.00);

		if(docAmount.compareTo(BigDecimal.ZERO)!=0 && docAmount.compareTo(amount)!=1){							
			BigDecimal percentage=docAmount.multiply(new BigDecimal(100)).divide(amount,2,BigDecimal.ROUND_HALF_UP);
			BigDecimal amountValue=new BigDecimal(400.00);
			amountValue=amountValue.multiply(percentage).divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP);
			System.out.println("Conducting Amount :"+amountValue.negate());
		}
		
		if(prescribingDocAmount.compareTo(BigDecimal.ZERO)!=0 && prescribingDocAmount.compareTo(amount)!=1){							
			BigDecimal percentage=prescribingDocAmount.multiply(new BigDecimal(100)).divide(amount,2,BigDecimal.ROUND_HALF_UP);
			BigDecimal amountValue=new BigDecimal(400.00);
			amountValue=amountValue.multiply(percentage).divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP);
			System.out.println("Prescribing Amount :"+amountValue.negate());
		}
		if(referalAmount.compareTo(BigDecimal.ZERO)!=0 && referalAmount.compareTo(amount)!=1){							
			BigDecimal percentage=referalAmount.multiply(new BigDecimal(100)).divide(amount,2,BigDecimal.ROUND_HALF_UP);
			BigDecimal amountValue=new BigDecimal(400.00);
			amountValue=amountValue.multiply(percentage).divide(new BigDecimal(100),2,BigDecimal.ROUND_HALF_UP);
			System.out.println("Referal Amount :"+amountValue.negate());
		}
		
		
		
		BigDecimal percentage=prescribingDocAmount.multiply(new BigDecimal(100)).divide(amount,2,BigDecimal.ROUND_HALF_UP);		
		System.out.println("percentage Value :"+percentage);
	}

}
/*

amount                | 3000.00
prescribing_dr_amount | 20.00
referal_amount        | 0.00
doctor_amount         | 600.00

*/
