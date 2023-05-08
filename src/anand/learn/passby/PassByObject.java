package anand.learn.passby;

public class PassByObject {

	private String attribute;

	public PassByObject(String a) {
		this.attribute = a;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
