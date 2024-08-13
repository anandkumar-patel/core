package anand.designpatterns.solid.openclosed.bad;

public class Shape {
    public double calculateArea(String shapeType) {
        if (shapeType.equals("Circle")) {
            // Calculate area for circle
        } else if (shapeType.equals("Rectangle")) {
            // Calculate area for rectangle
        }
        return 0;
    }
}
