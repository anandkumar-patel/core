package anand.learn.j2se.ds.linkedlist;

//Java Program to insert in a sorted list
public class LinkedList {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* function to insert a new_node in a list. */
	void sortedInsert(Node newNode) {
		Node current;

		/* Special case for head node */
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {

			/* Locate the node before point of insertion. */
			current = head;

			while (current.next != null && current.next.data < newNode.data)
				current = current.next;

			newNode.next = current.next;
			current.next = newNode;
		}
	}

	/* Utility functions */

	/* Function to create a node */
	Node newNode(int data) {
		Node x = new Node(data);
		return x;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
