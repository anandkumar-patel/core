package anand.designpatterns.solid.liskov.good;

public class SavingsAccount extends BankAccount implements Withdrawable{
	@Override
	public void calculateInterest() {
		balance += balance * 0.03; // 3% interest
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}