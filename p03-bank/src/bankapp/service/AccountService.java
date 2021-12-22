package bankapp.service;

import javax.swing.JOptionPane;
import bankapp.model.Account;

public class AccountService {
	public void deposit(Account account, double depositValue) {
		account.addBalance(depositValue);
	}
	
	public void withdraw(Account account, double withdrawValue) {
		String answer;
		double presentBalance = account.getBalance();
		if (withdrawValue > presentBalance) {
			answer = JOptionPane.showInputDialog("Saldo insuficiente. Deseja entrar no cheque especial? sim/nao");
			
			if (answer.equals("sim")) {
				double overdraft = account.getOverdraft();
				account.setBalance(presentBalance + overdraft);
				System.out.println("Alterando saldo com cheque especial R$" + account.getBalance());
				account.subtractBalance(withdrawValue);
			} else {
				System.out.println("Transação não efetuada.");
			}
		} else {
			account.subtractBalance(withdrawValue);
		}
		System.out.println("Seu saldo atual é R$" + account.getBalance());
	}
	
	public void transfer(Account sender, Account receiver, double value) {
		receiver.addBalance(value);
		sender.subtractBalance(value);
	}
}
