package anand.designpatterns.behavioral.chainofresponsibility;

public class PurchaseRequest {
    private final int amount;

    public PurchaseRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}