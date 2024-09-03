package anand.util.queues;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue= new PriorityQueue<>();
		queue.add(55);
		queue.add(21);
		queue.add(11);
		queue.add(34);
		queue.add(43);
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
	}

}
