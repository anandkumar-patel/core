package anand.learn.thread;

import java.util.concurrent.locks.ReentrantLock;

public class LiveLockDemo {

	public static void main(String[] args) {
		Account acct1 = new Account(101, 5000);
		Account acct2 = new Account(102, 7000);
		// Creating two threads
		Thread thread1 = new Thread(new Operation(acct1, acct2, 200));
		Thread thread2 = new Thread(new Operation(acct2, acct1, 300));

		thread1.start();
		thread2.start();
	}
}

class Account {
	int acctNum;
	int balance;
	ReentrantLock lock = new ReentrantLock();

	Account(int acctNum, int balance) {
		this.acctNum = acctNum;
		this.balance = balance;
	}

	//Method for depositing amount
	public boolean deposit(int amount) {
		System.out.println("In deposit method");
		if (this.lock.tryLock()) {
			try {
				// Simulating some delay
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("deposit in " + this.acctNum + " for " + Thread.currentThread().getName());
			this.balance = balance + amount;
			return true;
		}
		return false;
	}

	//Method for withdrawing amount
	public boolean withdraw(int amount) {
		System.out.println("In withdraw method");
		if (this.lock.tryLock()) {
			try {
				// Simulating some delay
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Withdrawn from " + this.acctNum + " for " + Thread.currentThread().getName());
			this.balance = balance - amount;
			return true;
		}
		return false;
	}

	public boolean transact(Account targetAcct, int amount) {
		System.out.println("In transact method " + targetAcct);
		boolean flag = false;
		// If you can withdraw from the source account and
		// deposit it into target account then only return true
		if (this.withdraw(amount) && targetAcct.deposit(amount)) {
			flag = true;
		} else {
			// Rollback and deposit the withdrawn amount back in source account
			System.out.println(
					"Failed to deposit in " + targetAcct.acctNum + " depositing back in account " + this.acctNum);
			this.deposit(amount);

		}
		return flag;
	}
}

class Operation implements Runnable {
	Account sourceAccount;
	Account targetAccount;
	int amount;

	Operation(Account sourceAccount, Account targetAccount, int amount) {
		this.sourceAccount = sourceAccount;
		this.targetAccount = targetAccount;
		this.amount = amount;
	}

	@Override
	public void run() {
		sourceAccount.transact(targetAccount, amount);
	}
}
