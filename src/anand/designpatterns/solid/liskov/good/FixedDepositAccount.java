package anand.designpatterns.solid.liskov.good;

public class FixedDepositAccount extends BankAccount {
	@Override
	public void calculateInterest() {
		balance += balance * 0.07; // 7% interest
	}
}