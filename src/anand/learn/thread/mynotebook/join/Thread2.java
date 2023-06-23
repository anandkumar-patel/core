package anand.learn.thread.mynotebook.join;

public class Thread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Begins of Thread2 run() ");
		for (int i=0;i<20;i++) {
			System.out.println("Value of i in run of Thread2 : "+i);
		}
	}

}
