package anand.designpatterns.solid.liskov.bad;

public class FixedDepositAccount extends BankAccount {
	@Override
	public void calculateInterest() {
		balance += balance * 0.07; // 7% interest
	}

	@Override
	public void withdraw(double amount) {
		// Violating LSP: FixedDepositAccount does not allow withdrawal
		throw new UnsupportedOperationException("Withdrawals are not allowed in Fixed Deposit Account");
	}
}