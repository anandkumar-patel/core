package anand.designpatterns.solid.openclosed.good;

public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

}
