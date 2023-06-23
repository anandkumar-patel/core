package anand.learn.thread;

public class YieldMethod {

	private Runnable runnable = () -> {
		Thread thread = Thread.currentThread();
		System.out.println("My Runnable class run method is executed by " + thread.getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Performming task " + i + " by " + thread.getName());
			if (i == 5) {
				Thread.yield();
			}
		}

	};

	public static void main(String[] args) {

		YieldMethod obj = new YieldMethod();
		Thread t1 = new Thread(obj.runnable, "Thread1");
		Thread t2 = new Thread(obj.runnable, "Thread2");
		Thread t3 = new Thread(obj.runnable, "Thread3");
		Thread t4 = new Thread(obj.runnable, "Thread4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
