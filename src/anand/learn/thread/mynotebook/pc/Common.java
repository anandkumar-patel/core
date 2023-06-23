package anand.learn.thread.mynotebook.pc;

public class Common {
	static int value;
	boolean flag = true;

	public synchronized void produce(int i) {
		if(flag) {
			value = i;
			System.out.println("Produced value is :"+value);
			flag = false;
			notify();
		}
		try {
			wait();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public synchronized int consume() {
		if(!flag) {
			try {
				wait();			
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}
		flag = true;
		notify();
		return value;
		
	}
}

