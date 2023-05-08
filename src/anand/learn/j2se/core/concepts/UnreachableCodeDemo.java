package anand.learn.j2se.core.concepts;
public class UnreachableCodeDemo {
	
	public static void main(String[] args) {
		UnreachableCodeDemo obj= new UnreachableCodeDemo();
		obj.unreachable2();
	}

    public void unreachable1() {
        System.out.println("how to do");
        return;
        //System.out.println("in java");
    }

    public void unreachable2() {
        System.out.println("how to do");
        if (true) {
            return;
        }
        System.out.println("in java");
    }

    public void unreachable3() {
        System.out.println("how to do");
        while (true) {
            return;
        }
        //System.out.println("in java");
    }
}

/**
 * First remove comment to check it.
 */
