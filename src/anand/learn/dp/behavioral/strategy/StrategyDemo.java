package anand.learn.dp.behavioral.strategy;

public class StrategyDemo {
	public static void main(String args[])
	{ 
		 ShoppingCart cart = new ShoppingCart();
	        cart.addItem(new Item("1234", 10.5));
	        cart.addItem(new Item("5678", 20.5));

	        // Pay with credit card
	        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "123", "12/24", "John Doe"));
	        cart.pay();

	        // Pay with PayPal
	        cart.setPaymentStrategy(new PayPalPayment("example@example.com", "password"));
	        cart.pay();
	}
}
