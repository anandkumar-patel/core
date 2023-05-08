package anand.learn.ds.linkedlist.singly;

public class SinglyLinkedListTest {
	public static SinglyLinkedList sll;

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		sll = new SinglyLinkedList();

		// add more elements to LinkedList
		sll.add("1");
		sll.add("2");
		sll.add("3");
		sll.add("4");
		sll.add("5");

		/*
		 * Please note that primitive values can not be added into LinkedList
		 * directly. They must be converted to their corresponding wrapper
		 * class.
		 */

		System.out.println("Print: Singly Linked List: \t\t" + sll);
		System.out.println(".size(): \t\t\t\t" + sll.size());
		System.out.println(".get(3): \t\t\t\t" + sll.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + sll.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + sll.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + sll.size());
		System.out.println("Print again: Singly Linked List: \t" + sll);
	}
}
