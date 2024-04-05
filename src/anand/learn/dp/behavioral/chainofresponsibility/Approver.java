package anand.learn.dp.behavioral.chainofresponsibility;

public interface Approver {
    void setSuccessor(Approver successor);
    void handleRequest(PurchaseRequest request);
}