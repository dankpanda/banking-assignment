package myPackage;

public class Account {
	private double balance;
	
	public Account() {
		this.balance = 0;
	}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public boolean deposit(double amt) {
		if(amt < 0) {
			return false;
		}
		balance += amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		if(amt > this.balance) return false;
		this.balance -= amt;
		return true;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
}
