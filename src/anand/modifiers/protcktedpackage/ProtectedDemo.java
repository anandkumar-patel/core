package anand.modifiers.protcktedpackage;

public class ProtectedDemo {

	private int privateData;
	protected int protectedData;
	int defaultData;
	public int publicData;

	private ProtectedDemo(int privateData) {
		this.privateData = privateData;
		this.protectedData = 2;
		this.defaultData = 3;
		this.publicData = 4;

	}

	protected ProtectedDemo(int privateData, int protectedData) {
		this.privateData = privateData;
		this.protectedData = protectedData;
		this.defaultData = 3;
		this.publicData = 4;

	}

	ProtectedDemo(int privateData, int protectedData, int defaultData) {
		this.privateData = privateData;
		this.protectedData = protectedData;
		this.defaultData = defaultData;
		this.publicData = 4;

	}

	public ProtectedDemo() {
		this.privateData = 1;
		this.protectedData = 2;
		this.defaultData = 3;
		this.publicData = 4;

	}

	public void displayData() {
		System.out.println("privateData :" + privateData + " ,protectedData :" + protectedData + " ,defaultData :"
				+ defaultData + " and publicData :" + publicData);
	}
}
