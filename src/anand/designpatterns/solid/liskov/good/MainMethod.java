package anand.designpatterns.solid.liskov.good;

public class MainMethod {
	public static void main(String[] args) {
		BankAccount savings = new SavingsAccount();
		BankAccount fixedDeposit = new FixedDepositAccount();

		savings.deposit(1000);
		fixedDeposit.deposit(1000);

		savings.calculateInterest();
		fixedDeposit.calculateInterest();

		// Correctly allows withdrawal because it's a SavingsAccount
		((Withdrawable) savings).withdraw(200);
		System.out.println("Savings balance after withdrawal: " + savings.getBalance());

		// Attempting to withdraw from a FixedDepositAccount will be a compile-time
		// error
		// ((Withdrawable) fixedDeposit).withdraw(200); // This will cause a
		// compile-time error

		System.out.println("Fixed Deposit balance: " + fixedDeposit.getBalance());
	}
}