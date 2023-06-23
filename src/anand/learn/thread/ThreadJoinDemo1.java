package anand.learn.thread;

public class ThreadJoinDemo1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadJoinDemo1 t1 = new ThreadJoinDemo1();
		ThreadJoinDemo1 t2 = new ThreadJoinDemo1();
		ThreadJoinDemo1 t3 = new ThreadJoinDemo1();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
