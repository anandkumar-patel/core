package anand.learn.dp.creational.singleton;

public class Singleton {

	private static Singleton obj = null;

	private String initialValue;

	private Singleton(String initialValue) {
		// if someone tries to create a second instance via reflection
		if(null != obj) {
			throw new IllegalStateException(
					"Singleton instance already exists. "
					+ "Use getInstance() method to get the instance.");
		}
		this.initialValue = initialValue;
	}

	// factory method
	public static Singleton getInstance(String initialValue) {
		if (null == obj) {
			synchronized (Singleton.class) {
				if (null == obj) {
					obj = new Singleton(initialValue);
				}
			}
		}
		return obj;

	}

	@Override
	public Object clone() {
		return obj;
	}
	
	
	public String getInitialValue() {
		return initialValue;
	}

}

/*
 * 1- It must have all private constructor.
 * 2- It must have private static reference of same class
 * 3- It must override the clone method and return the created instance.
 * 4- It must have a public static factory method with logic creating only one instance.
 * 
 * 
 * NOTE- The constructors are private so we can't subclass it.
 */