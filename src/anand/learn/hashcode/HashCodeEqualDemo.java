package anand.learn.hashcode;

import java.util.HashMap;

public class HashCodeEqualDemo {
	private String color;

	public HashCodeEqualDemo(String color) {
		this.color = color;
	}

	public int hashCode() {
		return this.color.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof HashCodeEqualDemo))
			return false;
		if (obj == this)
			return true;
		return this.color.equals(((HashCodeEqualDemo) obj).color);
	}

	public static void main(String[] args) {
		HashCodeEqualDemo a1 = new HashCodeEqualDemo("green");
		HashCodeEqualDemo a2 = new HashCodeEqualDemo("red");

		// hashMap stores apple type and its quantity
		HashMap<HashCodeEqualDemo, Integer> m = new HashMap<HashCodeEqualDemo, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m.get(a1));
	}
}
