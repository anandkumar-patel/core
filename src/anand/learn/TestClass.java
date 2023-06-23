package anand.learn;

public class TestClass {

	public static void main(String[] args) {
		A obj = new A();
		obj.start();
		synchronized (obj) {
			System.out.println("waiting");
			try {
				obj.wait();
			} catch(InterruptedException e) {
				
			}
			System.out.println(obj.count);
		}
	}
}

class A extends Thread {
	int count = 0;
	@Override
	public void run() {
		System.out.println("run method");
		synchronized (this) {
			for(int i =1;i<50;i++) {
				count = count+i;
			}
			notify();
		}
	}
}
