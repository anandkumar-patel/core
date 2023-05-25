package anand.learn.java8.lamda;

public class RunnableDemoLambda {

	public static void main(String[] args) {
		
		//without lambda expression
		Runnable obj = new Runnable() {
			@Override
			public void run() {
				System.out.println("run method ");
			}
		};
		Thread t = new Thread(obj);
		t.start();
		
		//with lambda expressin
		Runnable obj1 = ()->System.out.println("run method");
		Thread t1 = new Thread(obj1);
		t1.start();
		System.out.println("end of main method");
		
		
	}
	

}
