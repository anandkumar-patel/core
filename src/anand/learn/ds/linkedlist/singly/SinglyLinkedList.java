package anand.learn.ds.linkedlist.singly;

public class SinglyLinkedList {

	private static int counter;
	private Node<String> head;

	// Default constructor
	public SinglyLinkedList() {

	}

	// appends the specified element to the end of this list.
	public void add(String data) {

		// Initialize Node only in case of 1st element
		if (head == null) {
			head = new Node<String>(data);
		}

		Node<String> tempNode = new Node<String>(data);
		Node currentNode = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (currentNode != null) {

			// starting at the head node, crawl to the end of the list and then
			// add element
			// after last node
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}

			// the last node's "next" reference set to our new node
			currentNode.setNext(tempNode);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node tempNode = new Node(data);
		Node currentNode = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (currentNode != null) {
			// crawl to the requested index or the last element in the list,
			// whichever comes
			// first
			for (int i = 0; i < index && currentNode.getNext() != null; i++) {
				currentNode = currentNode.getNext();
			}
		}

		// set the new node's next-node reference to this node's next-node
		// reference
		tempNode.setNext(currentNode.getNext());

		// now set this node's next-node reference to the new node
		currentNode.setNext(tempNode);

		// increment the number of elements variable
		incrementCounter();
	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node currentNode = null;
		if (head != null) {
			currentNode = head.getNext();
			for (int i = 0; i < index; i++) {
				if (currentNode.getNext() == null)
					return null;

				currentNode = currentNode.getNext();
			}
			return currentNode.getData();
		}
		return currentNode;

	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node currentNode = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (currentNode.getNext() == null)
					return false;

				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
			return true;

		}
		return false;
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node currentNode = head.getNext();
			while (currentNode != null) {
				output += "[" + currentNode.getData().toString() + "]";
				currentNode = currentNode.getNext();
			}

		}
		return output;
	}
}
