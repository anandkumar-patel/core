package anand.learn.thread.consumerproducer;

import java.util.Queue;

/**
 * Consumer Thread will consumer values form shared queue.
 * 
 * It will use wait() method to wait if queue is empty.
 * 
 * It will also use notify method to send notification to producer thread after
 * consuming values from queue.
 * 
 *
 */
public class Consumer implements Runnable {
	private final Queue<Integer> sharedQ;

	public Consumer(Queue<Integer> sharedQ) {
		this.sharedQ = sharedQ;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (sharedQ) {
				while (sharedQ.isEmpty()) {
					try {
						System.out.println("Queue is Empty");
						sharedQ.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int number = (Integer) sharedQ.poll();
				System.out.println("removing Element " + number);
				sharedQ.notify();

			}
		}
	}

}
