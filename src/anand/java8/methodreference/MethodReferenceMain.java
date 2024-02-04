package anand.java8.methodreference;
public class MethodReferenceMain {

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
