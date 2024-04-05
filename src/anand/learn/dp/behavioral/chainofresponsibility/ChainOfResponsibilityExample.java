package anand.learn.dp.behavioral.chainofresponsibility;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();

        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);

        // Test the chain of responsibility
        PurchaseRequest purchase = new PurchaseRequest(500);
        manager.handleRequest(purchase);

        purchase = new PurchaseRequest(5000);
        manager.handleRequest(purchase);

        purchase = new PurchaseRequest(15000);
        manager.handleRequest(purchase);
    }
}