package anand.designpatterns.behavioral.chainofresponsibility;

public class VicePresident implements Approver {
    private Approver successor;

    @Override
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Vice President approves purchase of $" + request.getAmount());
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}