package anand.designpatterns.solid.liskov.good;

public abstract class BankAccount {
	protected double balance;

	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}
	
    public abstract void calculateInterest();
}
