package anand.learn.thread;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable{
    List<Integer> sharedListObj;
    Producer(List<Integer> sharedListObj){
        this.sharedListObj = sharedListObj;
    }
    @Override
    public void run() {
        int i = 0;
        while(true){
            synchronized (sharedListObj) {
                // While condition as mandated to avoid spurious wakeup
                while(sharedListObj.size() >= 1){
                    try {
                        sharedListObj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                // Putting value in the list
                System.out.println("Adding to queue - " + Thread.currentThread().getName() + " " + ++i);
                sharedListObj.add(i);
                sharedListObj.notify();    
                // To get out of while(true) loop, putting
                // only 5 values
                if(i > 9) break;
            }
        }
    }            
}

class Consumer implements Runnable{
    List<Integer> sharedListObj;
    Consumer(List<Integer> sharedListObj){
        this.sharedListObj = sharedListObj;
    }
    @Override
    public void run() {    
        while(true){
            synchronized (sharedListObj) {
                while(sharedListObj.size() < 1){
                    try {
                        sharedListObj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }                    
                }
                // Getting value from the list
                System.out.println("Getting from queue " + Thread.currentThread().getName() + " " + sharedListObj.get(0));
                // To get out of while(true) loop
                if(sharedListObj.get(0) == 10) break;
                sharedListObj.remove(0);
                sharedListObj.notify();        
                
            }
        }
    }
}

class ConsumerOne implements Runnable{
    List<Integer> sharedListObj;
    ConsumerOne(List<Integer> sharedListObj){
        this.sharedListObj = sharedListObj;
    }
    @Override
    public void run() {    
        while(true){
            synchronized (sharedListObj) {
                while(sharedListObj.size() < 1){
                    try {
                        sharedListObj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }                    
                }
                // Getting value from the list
                System.out.println("Getting from queue111 " + Thread.currentThread().getName() + " " + sharedListObj.get(0));
                // To get out of while(true) loop
                if(sharedListObj.get(0) == 10) break;
                sharedListObj.remove(0);
                sharedListObj.notify();        
                
            }
        }
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        // This is the shared list shared between producer
        // and consumer
        List<Integer> sharedListObj = new ArrayList<>();
        Thread t1 = new Thread(new Producer(sharedListObj), "Producer");
        Thread t2 = new Thread(new Consumer(sharedListObj), "Consumer");
        Thread t3 = new Thread(new ConsumerOne(sharedListObj), "ConsumerOne");
        t1.start();
        t2.start();   
        t3.start();
    }

}