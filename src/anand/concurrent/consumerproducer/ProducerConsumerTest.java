package anand.concurrent.consumerproducer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Simple Java Program to test Producer Consumer Design Pattern using wait,
 * notify and notifyAll() methods
 */
public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException {

		final Queue<Integer> sharedQ = new LinkedList<>();

		Thread consumerThread = new Thread(new Consumer(sharedQ), "CONSUMER");
		Thread producerThread = new Thread(new Producer(sharedQ, 4), "PRODUCER");

		producerThread.start();
		consumerThread.start();

	}
}
