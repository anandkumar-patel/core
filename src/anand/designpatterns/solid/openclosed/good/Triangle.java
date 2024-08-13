package anand.designpatterns.solid.openclosed.good;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}


	@Override
	public double calculateArea() {
		return base*height*base*.5;
	}

}
