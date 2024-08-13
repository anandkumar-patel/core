package anand.designpatterns.solid.liskov.bad;

public class SavingsAccount extends BankAccount {
	@Override
	public void calculateInterest() {
		balance += balance * 0.03; // 3% interest
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}