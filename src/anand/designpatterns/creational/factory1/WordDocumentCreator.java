package anand.designpatterns.creational.factory1;

// ConcreteCreator
public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
