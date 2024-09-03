package anand.designpatterns.creational.factory1;



// Usage
public class ClientClass {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PdfDocumentCreator();
        DocumentManager pdfManager = new DocumentManager(pdfCreator);
        pdfManager.openDocument(); // Output: Opening PDF document.

        DocumentCreator wordCreator = new WordDocumentCreator();
        DocumentManager wordManager = new DocumentManager(wordCreator);
        wordManager.openDocument(); // Output: Opening Word document.
    }
}
