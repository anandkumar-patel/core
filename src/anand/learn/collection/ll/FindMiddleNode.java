package anand.learn.collection.ll;

import java.util.List;

import anand.learn.collection.ll.sll.LinkedList;

public class FindMiddleNode {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(15);
		ll.insertAtEnd(11);
		ll.insertAtEnd(14);
		ll.insertAtEnd(13);
		ll.insertAtEnd(12);
		ll.insertAtEnd(10);
		ll.insertAtEnd(17);
		//ll.insertAtEnd(19);
		
		ll.display();
		System.out.println(ll.findTheMiddleNodeData());
		
		List<Integer> output = ll.findTheMiddleNodesData();
		System.out.println(output);
	}

}
