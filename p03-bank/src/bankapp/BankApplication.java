package bankapp;

import bankapp.model.Account;
import bankapp.service.AccountService;

public class BankApplication {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountService terminal = new AccountService();
		terminal.deposit(account, 12.0);
		System.out.println(account.getBalance());		
		
	}

}
