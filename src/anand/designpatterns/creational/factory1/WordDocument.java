package anand.designpatterns.creational.factory1;

// ConcreteProduct
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}
