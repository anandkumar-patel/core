package anand.learn.vararg;

public class VarArgDemo {

	public static void main(String[] args) {
		VarArgDemo obj=new VarArgDemo();
		obj.foo("Anand");
		obj.foo("Patel", 1, 2);


	}
	void foo(String a, int... b) {
	    int b1 = b.length > 0 ? b[0] : 0;
	    int b2 = b.length > 1 ? b[1] : 0;
	    System.out.println("hiii "+a+" Values are "+b1+" and "+b2);
	}
	
}
