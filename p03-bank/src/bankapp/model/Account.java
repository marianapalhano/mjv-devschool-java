package bankapp.model;

public class Account {
	public Account(double balance, double overdraft) {
		super();
		this.balance = balance;
		this.overdraft = overdraft;
	}

	private double balance;
	private double overdraft;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getOverdraft() {
		return this.overdraft;
	}
	
	public double addBalance(double value) {
		return this.balance += value;
	}
	
	public double subtractBalance(double value) {
		return this.balance -= value;
	}
}
