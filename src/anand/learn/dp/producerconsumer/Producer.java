package anand.learn.dp.producerconsumer;

import java.util.concurrent.BlockingQueue;

public  class Producer implements Runnable {

    private final BlockingQueue sharedQueue;

    public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

     public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
            	System.err.println(ex);
            }
        }
    }

}
