package anand.learn.ds.linkedlist.singly;

public class Node<T> {
	// reference to the next node in the chain, or null if there isn't one.
	Node<T> next;

	// data carried by this node. could be of any type you need.
	T data;

	// Node constructor
	public Node(T dataValue) {
		next = null;
		data = dataValue;
	}

	// another Node constructor if we want to specify the node to point to.
	public Node(T dataValue, Node<T> nextValue) {
		next = nextValue;
		data = dataValue;
	}

	// these methods should be self-explanatory
	public T getData() {
		return data;
	}

	public void setData(T dataValue) {
		data = dataValue;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> nextValue) {
		next = nextValue;
	}
}
