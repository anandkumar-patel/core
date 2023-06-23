package anand.learn.dp.creational.singleton;


public class BillPughSingleton {

	private static BillPughSingleton obj = null;

	private String initialValue;

	private BillPughSingleton() {
		this.initialValue = "Hi Anand";
	}
	
	// Inner class to provide instance of class 
	  private static class BillPughSingletonInner 
	  { 
	    private static final BillPughSingleton INSTANCE = new BillPughSingleton(); 
	  } 

	// factory method
	public static BillPughSingleton getInstance() {
		return BillPughSingletonInner.INSTANCE;
	}

//	@Override
//	public Object clone() {
//		return obj;
//	}
//	
	
	public String getInitialValue() {
		return initialValue;
	}
}
