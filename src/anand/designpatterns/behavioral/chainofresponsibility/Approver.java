package anand.designpatterns.behavioral.chainofresponsibility;

public interface Approver {
    void setSuccessor(Approver successor);
    void handleRequest(PurchaseRequest request);
}