package Banks;

import java.util.ArrayList;

public class BankRunner {
	
	public static void main(String[] args) throws PreviouslyExistingAccountException, NonExistantAccountException, AccountOverdrawnException {
		ArrayList<Account> list = new ArrayList<Account>();
		Bank bank = new Bank(list);
		
		Account a = new Account(1, 420.33f);
		bank.addAccount(a, 1);
		Account b = new Account(2, 14124f);
		bank.addAccount(b, 2);
		Account c = new Account(3, 12.99f);
		bank.addAccount(c, 3);
		Account d = new Account(4, 68.50f);
		bank.addAccount(d, 4);
		
		c.withdrawMoney(12);
		
		Account f = new Account(5, 12);
		f.withdrawMoney(5);
	}

}
