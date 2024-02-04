package anand.learn.thread.mynotebook;

public class DaemonThreadDemo extends Thread {

	@Override
	public void run() {
		int count = 0;
		while (true) {
			count++;
			System.out.println("Deamon : " + count);
		}
	}
	
	public static void main(String[] args) {
		
		DaemonThreadDemo obj = new DaemonThreadDemo();
		obj.setDaemon(true);
		obj.start();
		for(int i=0;i<100;i++) {
			System.out.println("Main : "+i);
		}
		
	}

}


/*
 * 	POINT-1 : Daemon thread would never joined.
 * 
 *  POINT-2 : Once control comes out from parent thread, the daemon thread is 
 *  		  automatically terminated.
 *   
 */