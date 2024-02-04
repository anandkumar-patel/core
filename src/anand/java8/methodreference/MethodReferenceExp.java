package anand.java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExp {

	public static void printMessage(String msg) {
		System.out.println("Message in static method is : " + msg);
	}

	public void displayMessage(String msg) {
		System.out.println("Message in instance method is : " + msg);
	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Anand", "Patel", "Bhat");
		// basic way to print each element
		input.forEach(str -> System.out.println(str));

		// static method reference.
		input.forEach(MethodReferenceExp::printMessage);

		// instance method reference
		MethodReferenceExp obj = new MethodReferenceExp();
		input.forEach(obj::displayMessage);

		List<Student> students = input.stream().map(name -> new Student(name)).collect(Collectors.toList());
		students.forEach(student -> System.out.println(student.getName()));

		System.out.println("using constructor reference :");
		List<Student> students1 = input.stream().map(Student::new).collect(Collectors.toList());
		students1.forEach(student -> System.out.println(student.getName()));

	}

}
