package Banks;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account> acclist;
	Bank(ArrayList<Account> a) {
		acclist=a;
	}
	
	void addAccount(Account a, int accnum) throws PreviouslyExistingAccountException {
		for(Account q: acclist) {
			if(q.getAccnum()!=accnum) {
				break;
			} else {
				throw new PreviouslyExistingAccountException("User already exists");
			}
		}
		acclist.add(a);
		a.setAccnum(accnum);
	}
	void removeAccount(int accnum) throws NonExistantAccountException {
		for(Account q: acclist) {
			if(q.getAccnum()==accnum) {
				acclist.remove(q);
			} else {
				throw new NonExistantAccountException("User not available");
			}
		}
	}
	void AddMoney(int accnum, float money) throws NonExistantAccountException {
		for(Account q: acclist) {
			if(q.getAccnum()==accnum) {
				q.addMoney(money);
			} else {
				throw new NonExistantAccountException("User not available");
			}
		}
	}
	void WithDrawMoney(int accnum, float money) throws NonExistantAccountException, AccountOverdrawnException {
		for(Account q: acclist) {
			if(q.getAccnum()==accnum) {
				if(q.getBalance()>=money) {
					q.withdrawMoney(money);
				} else {
					throw new AccountOverdrawnException("You are bankrupt");
				}
			} else {
				throw new NonExistantAccountException("User not available");
			}
		}
	}
}
