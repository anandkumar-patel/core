package anand.designpatterns.behavioral.chainofresponsibility;

public class Director implements Approver {
    private Approver successor;

    @Override
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approves purchase of $" + request.getAmount());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}