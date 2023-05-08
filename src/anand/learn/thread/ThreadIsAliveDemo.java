package anand.learn.thread;

public class ThreadIsAliveDemo extends Thread
{
public void run()
   {
       System.out.println("r1 ");
       try{
        Thread.sleep(5000);
    }catch(InterruptedException ie){}
       
       System.out.println("r2 ");
  }
public static void main(String[] args)
{
ThreadIsAliveDemo t1=new ThreadIsAliveDemo();
ThreadIsAliveDemo t2=new ThreadIsAliveDemo();
t1.start(); 
t2.start();
System.out.println(t1.isAlive());
System.out.println(t2.isAlive());
}
}