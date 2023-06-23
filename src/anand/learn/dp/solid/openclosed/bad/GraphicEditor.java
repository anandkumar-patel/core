package anand.learn.dp.solid.openclosed.bad;

public class GraphicEditor {

	public void drawShape(Shape s) {
 		if (s.m_type==1) {
 			Rectangle r = (Rectangle) s;
 			drawRectangle(r);
 		}
 		else if (s.m_type==2) {
 			Circle c = (Circle) s;
 			drawCircle(c);
 		}
 	}
 	private void drawCircle(Circle r) {
 		System.out.println("Drawing circle....");
 	}
 	private void drawRectangle(Rectangle r) {
 		System.out.println("Drawing rectangle....");

 	}
}

