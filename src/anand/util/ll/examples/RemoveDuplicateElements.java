package anand.util.ll.examples;

import anand.util.ll.sll.SinglyLinkedList;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertAtStart(11);
		sll.insertAtStart(21);
		sll.insertAtStart(12);
		sll.insertAtStart(22);
		sll.insertAtStart(11);
		sll.insertAtStart(22);
		sll.insertAtStart(10);
		sll.insertAtStart(21);
	
		sll.display();
		
	}

}
