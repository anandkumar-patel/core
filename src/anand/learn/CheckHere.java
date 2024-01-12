package anand.learn;

public class CheckHere {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		
		Node node1 = new Node(11);
		Node node2 = new Node(12);
		Node node3 = new Node(13);
		Node node4 = new Node(14);
		
		root.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		Node temp = root;
		while(temp != null) {
			System.out.println("The data is :"+temp.data);
			temp = temp.next;
		}
		
	}
	
	
	private Node reversedLinkedList(Node root) {
		Node temp = root;
		while(temp != null) {
			
		}
		return null;
	}
	
	
}

class Node {
	int data ;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
		
	}
}
