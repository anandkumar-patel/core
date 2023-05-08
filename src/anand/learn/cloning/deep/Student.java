package anand.learn.cloning.deep;

public class Student implements Cloneable {
	int id;
	String name;
	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student object = (Student) super.clone();
		object.course = (Course) course.clone();
		return object;
	}
}
