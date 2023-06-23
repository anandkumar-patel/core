package anand.learn.thread.mynotebook.pc;

public class ProducerConsumerMain {

	public static void main(String[] args) {

		Common common = new Common();
		Producer p = new Producer(common);
		Consumer c = new Consumer(common);
		
		
		p.start();
		c.start();
	}

}
