package anand.java8.lambda;

import java.math.BigDecimal;

public class Developer {
	private String name;
	private BigDecimal salary;
	private int age;

	public Developer(String name, BigDecimal salary, int age) {

		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " " + salary + " " + age;
	}

}
