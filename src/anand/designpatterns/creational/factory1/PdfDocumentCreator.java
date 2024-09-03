package anand.designpatterns.creational.factory1;

// ConcreteCreator
public class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
