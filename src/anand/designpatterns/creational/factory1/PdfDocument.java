package anand.designpatterns.creational.factory1;

// ConcreteProduct
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
