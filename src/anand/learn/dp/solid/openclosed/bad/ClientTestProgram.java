package anand.learn.dp.solid.openclosed.bad;

public class ClientTestProgram {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		ge.drawShape(c);
		ge.drawShape(r);
	}

}
