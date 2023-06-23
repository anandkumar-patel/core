package anand.learn.thread.mynotebook.join;

public class Thread3 extends Thread {
	Thread1 t1;
	Thread3(Thread1 t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		System.out.println("Begins of Thread3 run() ");
		for(int i=30;i<40;i++) {
			System.out.println("Value of i in run of Thread3 : "+i);
			if(i==35) {
				try {
					t1.join();
				} catch(InterruptedException ie) {
					System.err.println(ie.getMessage());
				}
				int x = t1.sum-i;
				System.out.println("Sum is : "+t1.sum);
				System.out.println("Diff is : "+x);
			}
		}
	}

}
