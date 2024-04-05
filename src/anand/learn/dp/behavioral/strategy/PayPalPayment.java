package anand.learn.dp.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        // Implement PayPal payment logic here
        System.out.println("Paid " + amount + " using PayPal.");
        System.out.println("Paypal details [email = "+email+ ", password = "+password+" ]");
    }
}
