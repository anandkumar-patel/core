package anand.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	transient int age;
	String name;
	char grade;

	Student(int age, String name, char grade) {
		this.age = age;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", grade=" + grade + "]";
	}
	
}