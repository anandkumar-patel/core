package anand.learn.dp.solid.openclosed.bad;

//Open-Close Principle - Bad example
class GraphicEditor {

	public void drawShape(Shape s) {
		if (s.m_type == 1)
			drawRectangle((Rectangle) s);
		else if (s.m_type == 2)
			drawCircle((Circle) s);
	}

	private void drawCircle(Circle r) {
		System.out.println("Circle is drwan.....");
	}

	private void drawRectangle(Rectangle r) {
		System.out.println("Recatangle is drwan.....");
	}

	// when new shape is get added new method definition and check that
	// condition
	// is required- so bad
}

class Shape {
	int m_type;
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
}

public class BadExample {
	public static void main(String[] args) {
		GraphicEditor geObj = new GraphicEditor();
		Shape s = new Rectangle();
		// s= new Circle();
		geObj.drawShape(s);
	}
}
