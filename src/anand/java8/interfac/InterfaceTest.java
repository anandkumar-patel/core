package anand.java8.interfac;

public interface InterfaceTest {
	int x=11; // All variable by default-> public static final
	int doSomething(); //all method by default public abstract 
	//static int doSomething1(); //static method not allowed
	static int doSomething2() {
		return 0;
		
	}
	
	public default void defaultMethod() {
		
	}
}

/**
 * =================== POINTS==========================
 * 1- Interface don't have constructor, because constructor's purpose is 
 * 	  to initialize member variable
 * 	  as we know interface don't have member variable. all variable in interface are by default
 * 	  final, public and static.
 * 
 * 2- Static method can be defined in jdk8 onwards, but we can't declare.
 * 	   
 */
