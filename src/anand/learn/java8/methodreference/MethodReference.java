package anand.learn.java8.methodreference;

@FunctionalInterface
interface Calculator {
	void add(int a, int b);
}

class CalC {
	public static void addSomething(int a, int b) {
		System.out.println(a + " and " + b + " addition is " + (a + b));
	}

	public void letsAdd(int a, int b) {
		System.out.println(a + " and " + b + " adds to " + (a + b));
	}
}

@FunctionalInterface
interface Messenger {
	void displayMsg(String msg);
}

class Message {
	public Message(String msg) {
		System.out.println(">>> Message is :" + msg);
	}
}

public class MethodReference {

	public static void main(String[] args) {

		// reference to a static method
		Calculator cRef = CalC::addSomething;
		cRef.add(11, 12);

		// reference to a instance method
		CalC calObj = new CalC();
		Calculator cRef1 = calObj::letsAdd;
		cRef1.add(14, 15);

		// reference to constuctor
		Messenger msgRef =Message::new;
		msgRef.displayMsg("Anand Patel");

	}

}
