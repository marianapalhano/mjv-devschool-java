package bankapp.model;

public class Account {
	private double balance;	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double addBalance(double value) {
		return this.balance += value;
	}
	
	public double subtractBalance(double value) {
		return this.balance -= value;
	}
}
