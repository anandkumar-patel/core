package anand.learn.thread;

public class DaemonThreadExample {
    public static void main(String[] args) {
        // Create a new thread and mark it as daemon
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Marking the thread as daemon
        daemonThread.start(); // Start the daemon thread

        // Main thread
        System.out.println("Main thread exiting...");
    }
}

// A task to be executed by the daemon thread
class DaemonTask implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Daemon thread is running...");
                Thread.sleep(1000); // Simulate some work
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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