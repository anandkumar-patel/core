package anand.learn.thread.mynotebook.pc;

public class Consumer extends Thread {
	Common c ;
	
	public Consumer(Common c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		while(true) {
			int i = c.consume();
			System.out.println("Consumed Value :"+i);
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}

}
