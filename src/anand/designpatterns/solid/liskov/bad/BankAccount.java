package anand.designpatterns.solid.liskov.bad;

public abstract class BankAccount {
	protected double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
	
	public abstract void calculateInterest();
}
