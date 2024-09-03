package anand.modifiers;


public class PrivateDemo {


	public static void main(String[] args) {

		// PrivateModifier obj = new PrivateModifier(); // this is not accesible

		PrivateModifier obj1 = PrivateModifier.getInstance(12, "Patel");
		System.out.println(obj1.toString());
	}

}

class PrivateModifier {
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
		System.out.println("Hello " + name + " your id is :" + id);
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
