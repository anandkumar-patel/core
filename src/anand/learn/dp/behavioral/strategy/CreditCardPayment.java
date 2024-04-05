package anand.learn.dp.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        // Implement credit card payment logic here
        System.out.println("Paid " + amount + " using Credit Card.");
        System.out.println("Credit card details :[ card number = "+cardNumber+", cvv = "+cvv+", expiryDate = "+expiryDate+", cardHolderName = "+cardHolderName+" ]");
    }
}
