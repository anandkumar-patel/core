package anand.learn.thread.ex01;

public class ClassA {

	public synchronized void method1(ClassB obj) {
		System.out.println("Thread1 start execution of method1");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread1 trying to call classb last method");
		obj.last();
	}

	public synchronized void last() {
		System.out.println("Inside classa last method");
	}
}
