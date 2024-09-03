package anand.designpatterns.creational.factory1;

public class DocumentManager {
    private DocumentCreator creator;

    public DocumentManager(DocumentCreator creator) {
        this.creator = creator;
    }

    public void openDocument() {
        Document document = creator.createDocument();
        document.open();
    }
}
