package anand.learn.collection.ll.sll;

/*  Class Node  */
public class Node {
	protected int data;
	protected Node next;

	/* Constructor */
	public Node(int data) {
		this.data = data;
		next = null;
	}

	/* Function to set link to next Node */
	public void setNext(Node next) {
		this.next = next;
	}

	/* Function to set data to current Node */
	public void setData(int data) {
		this.data = data;
	}

	/* Function to get link to next node */
	public Node getNext() {
		return next;
	}

	/* Function to get data from current Node */
	public int getData() {
		return data;
	}
}