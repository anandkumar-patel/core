package anand.learn.java8.collection.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue queue = new ArrayBlockingQueue(50);

		Thread t1 = new Thread(new Producer(queue));
		Thread t2 = new Thread(new Consumer(queue));
		Thread t3 = new Thread(new Consumer(queue));
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
	}
}