package anand.learn.solution;

public class DemoException {

	public static void main(String[] args) {
		DemoException obj = new DemoException();
		try {
			obj.demo();
		} catch (HMSException ex) {
			System.out.println("error");
		}
	}

	
	public void demo(){
		
		for (int i=0;i <6;i++) {
			try {
			if(i==3) {
				throw new HMSException();
				
			}
			if (i ==5) {
				throw new HMSException();
			}
			System.out.println("Value of I :"+i);
			} catch (HMSException ex) {
				System.out.println("error1");
			}
		}
		
	}
}

class HMSException extends RuntimeException {
	
}

