package anand.learn.thread;

public class ThreadDemo extends Thread
{
	private int counter;
	@Override
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<100000;i++)
			counter++;
			this.notifyAll();
			System.out.println("Complete Counting.....");			
		}
	}
	public static void main(String []args) throws Exception
	{
		ThreadDemo td= new ThreadDemo();
		td.start();
		Thread.sleep(10000);
		System.out.println("Waiting to get end.....");
		synchronized(td)
		{ 
			td.wait();
		}
		System.out.println(td.counter);
	}
}