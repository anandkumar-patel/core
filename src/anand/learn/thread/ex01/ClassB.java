package anand.learn.thread.ex01;

public class ClassB {

	public synchronized void method2(ClassA obj) {
		System.out.println("Thread2 start execution of method2");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread2 trying to call classb last method");
		obj.last();
	}

	public synchronized void last() {
		System.out.println("Inside classb last method");
	}
}
