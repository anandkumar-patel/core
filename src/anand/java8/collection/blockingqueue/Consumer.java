package anand.java8.collection.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private final BlockingQueue queue;

	Consumer(BlockingQueue q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				consume(queue.take());
				Thread.sleep(10);
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}

	void consume(Object x) {
		System.out.printf("Take %s %s", x, System.lineSeparator());
	}
}
