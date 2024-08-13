package anand.designpatterns.solid.liskov.bad;

public class MainMethod {
	public static void main(String[] args) {
		// Substituting parent class with child class objects
        BankAccount savings = new SavingsAccount();
        BankAccount fixedDeposit = new FixedDepositAccount();

        savings.deposit(1000);
        fixedDeposit.deposit(1000);

        savings.calculateInterest();
        fixedDeposit.calculateInterest();

        // Demonstrate substitution
        printAccountDetails(savings);
        printAccountDetails(fixedDeposit);

        // SavingsAccount allows withdrawal, so we need to cast it to the correct type
        ((SavingsAccount) savings).withdraw(200);
       
        System.out.println("Savings balance after withdrawal: " + savings.getBalance());

        // Cannot withdraw from FixedDepositAccount, no cast to withdraw is done
    }

    // Method demonstrating LSP: It can accept any BankAccount subtype
    public static void printAccountDetails(BankAccount account) {
        System.out.println("Account balance: " + account.getBalance());
    }
}