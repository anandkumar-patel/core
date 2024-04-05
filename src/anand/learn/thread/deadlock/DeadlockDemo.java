package anand.learn.thread.deadlock;

public class DeadlockDemo extends Thread {

	ClassA obj1 = new ClassA();
	ClassB obj2 = new ClassB();

	public void m1() {
		this.start();
		obj1.method1(obj2);
	}

	@Override
	public void run() {
		obj2.method2(obj1);
	}

	public static void main(String[] args) {
		DeadlockDemo mainObj = new DeadlockDemo();
		mainObj.m1();
	}
}
