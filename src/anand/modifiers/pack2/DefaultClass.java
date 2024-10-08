package anand.modifiers.pack2;

class DefaultClass {
	private String privateField;
	String defaultField;
	public String publicField;

	DefaultClass(String privateField, String defaultField, String publicField) {
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
