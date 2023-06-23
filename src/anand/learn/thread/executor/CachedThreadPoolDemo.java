package anand.learn.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		// submit the task for execution
		for (int i = 0; i < 100; i++) {
			service.execute(new Task());
		}
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("hello");
		}

	}
}
