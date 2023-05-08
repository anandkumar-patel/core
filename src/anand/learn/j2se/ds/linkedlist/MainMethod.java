package anand.learn.j2se.ds.linkedlist;

import anand.learn.j2se.ds.linkedlist.LinkedList.Node;

public class MainMethod {

	/* Drier function to test above methods */
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		Node newNode;
		newNode = llist.newNode(5);
		llist.sortedInsert(newNode);
		newNode = llist.newNode(10);
		llist.sortedInsert(newNode);
		newNode = llist.newNode(7);
		llist.sortedInsert(newNode);
		newNode = llist.newNode(3);
		llist.sortedInsert(newNode);
		newNode = llist.newNode(1);
		llist.sortedInsert(newNode);
		newNode = llist.newNode(9);
		llist.sortedInsert(newNode);
		System.out.println("Created Linked List");
		llist.printList();
	}

}
