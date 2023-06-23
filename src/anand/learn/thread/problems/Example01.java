package anand.learn.thread.problems;

import java.util.concurrent.Semaphore;

public class Example01 {
	private static Semaphore firstSemaphore = new Semaphore(1);
	private static Semaphore secordSemaphore = new Semaphore(0);
	private static Semaphore thirdSemaphore = new Semaphore(0);

	public void first(Runnable printFirst) throws InterruptedException {
		firstSemaphore.acquire();
		// printFirst.run() outputs "first". Do not change or remove this line.
		printFirst.run();
		secordSemaphore.release();
	}

	public void second(Runnable printSecond) throws InterruptedException {
		secordSemaphore.acquire();
		// printSecond.run() outputs "second". Do not change or remove this
		// line.
		printSecond.run();
		thirdSemaphore.release();
	}

	public void third(Runnable printThird) throws InterruptedException {
		thirdSemaphore.acquire();
		// printThird.run() outputs "third". Do not change or remove this line.
		printThird.run();
		firstSemaphore.release();
	}
}
