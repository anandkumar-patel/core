package anand.learn.thread.mynotebook.join;

public class Thread1 extends Thread {
	int sum =0;
	
	@Override
	public void run() {
		System.out.println("Begins of Thread1 run() ");
		for (int i=0;i<10;i++) {
			sum = sum+i;
			System.out.println("Value of i in run of Thread1 : "+i);
		}
	}

}
