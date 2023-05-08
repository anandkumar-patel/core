package anand.learn.dp.solid.openclosed.good;

//Open-Close Principle - Good example
class GraphicEditor {
	public void drawShape(Shape s) {
		s.draw();
	}
}

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape  {
	public void draw() {
		System.out.println("Rectangle is drwan");
	}
} 

class Circle extends Shape  {
	public void draw() {
		System.out.println("Circle is drwan");
	}
}

public class PerfectExample {

	public static void main(String[] args) {
		GraphicEditor geObj= new GraphicEditor();
		Shape s= new Rectangle();
		s= new Circle();
		geObj.drawShape(s);
	}

}
