package anand.learn.thread;

public class JoinDemo {

	static Thread test(final int x, final Thread testThread) {
		Thread testThread1 = new Thread() {
			public void run() {
				System.out.println(x + 1);
				try {
					testThread.join();
				} catch (InterruptedException e) {
				}
				System.out.println(x + 2);
			}
		};
		System.out.println(x + 3);
		testThread1.start();
		System.out.println(x + 4);
		return testThread1;
	}

	public static void main(String[] args) {
		test(10, test(20, Thread.currentThread()));
	}

}
