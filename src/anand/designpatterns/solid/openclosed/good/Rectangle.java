package anand.designpatterns.solid.openclosed.good;

public class Rectangle extends Shape{
	private int length;
	private int width;

	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}


	@Override
	public double calculateArea() {
		return length*width;
	}

}
