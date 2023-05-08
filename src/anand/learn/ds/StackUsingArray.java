package anand.learn.ds;

public class StackUsingArray {

	public static void main(String[] args) {

		Stack obj = new Stack(3);
		System.out.println(obj.pop());
		obj.push(11);
		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.stackData();
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());

		obj.stackData();

	}

}

class Stack {
	private int stackarr[];
	int size;
	int top;

	public Stack(int size) {
		this.size = size;
		stackarr = new int[size];
		top = -1;
	}

	public void push(int data) {
		if (this.isFull()) {
			System.out.println("Stack is full, you can push any Item");
			return;
		}
		top++;
		stackarr[top] = data;
	}

	public int pop() {
		if (this.isEmpty()) {
			return 0;
		}
		int poppedData = stackarr[top];
		stackarr[top] = 0;
		top--;

		return poppedData;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void stackData() {
		System.out.println("Data is stack from top to bottum :");
		int length = this.top;
		while (length > 0) {
			System.out.print(stackarr[length - 1] + " ");
			length--;
		}
		System.out.println("");
	}

}
