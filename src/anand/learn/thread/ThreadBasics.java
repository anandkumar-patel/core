package anand.learn.thread;

public class ThreadBasics {

	public static void main(String args[]) {

		// instance of Runnable implementation for threads
		ParallelTask task = new ParallelTask();

		// This will only create instance of Thread class
		// it will not start until you call start() method
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		// set as daemon thread
		t1.setDaemon(true);
		t2.setDaemon(true);

		// Starting T1 and T2 thread
		t1.start();
		t2.start();

		System.out.println("Main Thread is finished...");
	}

}

/*
 * Always use Runnable to put code which you want to execute parallel Using
 * multiple threads.
 */
class ParallelTask implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.currentThread().getName() + " is executing ParallelTask");

	}
}
