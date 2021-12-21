package bankapp.service;

import bankapp.model.Account;

public class AccountService {
	public void deposit(Account account, double depositValue) {
		account.addBalance(depositValue);
	}
	
	public void withdraw(Account account, double withdrawValue) {
		account.subtractBalance(withdrawValue);
	}
	
	public void transfer(Account sender, Account receiver, double value) {
		receiver.addBalance(value);
		sender.subtractBalance(value);
	}
}
