package anand.learn.modifiers;

import java.util.logging.Logger;

public class PrivateDemo {

	private static final Logger log = Logger.getLogger(PrivateModifier.class.getName());

	public static void main(String[] args) {

		// PrivateModifier obj = new PrivateModifier(); // this is not accesible

		PrivateModifier obj1 = PrivateModifier.getInstance(12, "Patel");
		log.info(obj1.toString());
	}

}

class PrivateModifier {
	private static final Logger log = Logger.getLogger(PrivateModifier.class.getName());
	private int id;
	private String name;

	private PrivateModifier() {
		this.id = 11;
		this.name = "anand";

	}

	private PrivateModifier(int id, String name) {
		this.id = id;
		this.name = name;

	}

	private void privateMethod() {
		log.info("Hello " + name + " your id is :" + id);
	}

	@Override
	public String toString() {
		return "PrivateModifier [id=" + id + ", name=" + name + "]";
	}

	// factory method
	public static PrivateModifier getInstance(int id, String name) {
		return new PrivateModifier();
	}
}
