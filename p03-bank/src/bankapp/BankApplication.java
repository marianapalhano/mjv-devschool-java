package bankapp;

import bankapp.model.Account;
import bankapp.service.AccountService;

public class BankApplication {

	public static void main(String[] args) {
		
		Account account = new Account(50.0, 20.0);
		
		AccountService terminal = new AccountService();
		terminal.withdraw(account, 60);
				
		
	}

}
