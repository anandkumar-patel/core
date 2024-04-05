package anand.learn.thread.pool;

public class WorkerThread implements Runnable {
	private int counter;

	public WorkerThread(int counter) {
		this.counter = counter;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start), counter = " + counter);
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	private void processmessage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
