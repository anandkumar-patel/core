package anand.learn.modifiers.pack2;

public class PublicClass {
	private String privateField;
	String defaultField;
	public String publicField;

	public PublicClass(String privateField, String defaultField, String publicField) {
		super();
		this.privateField = privateField;
		this.defaultField = defaultField;
		this.publicField = publicField;
	}

	public void publicMethod() {
		System.out.println("pack2 publicMethod...." + publicField);
	}

	void defaultMethod() {
		System.out.println("pack2 defaultMethod...." + defaultField);
	}

	private void privateMethod() {
		System.out.println("pack2 privateMethod...." + privateField);
	}
}
