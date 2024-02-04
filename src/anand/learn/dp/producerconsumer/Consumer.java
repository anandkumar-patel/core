package anand.learn.dp.producerconsumer;

import java.util.concurrent.BlockingQueue;


public  class Consumer implements Runnable{

    private final BlockingQueue sharedQueue;

    public Consumer (BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
     public void run() {
        while(true){
            try {
                System.out.println("Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
            	System.err.println(ex);
            }
        }
    }
  
  
}

