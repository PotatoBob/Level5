package Banks;

public class Account {
	int accnum = 0;
	float balance = 0;
	Account(int a, float b) {
		accnum = a;
		balance = b;
	}
		int getAccnum() {
			return accnum;
		}
		void setAccnum(int a) {
			accnum=a;
		}
		float getBalance() {
			return balance;
		}
		void setBalance(float b) {
			balance=b;
		}
		void addMoney(float money) {
			setBalance(balance+=money);
		}
		void withdrawMoney(float money) throws AccountOverdrawnException {
			if(balance<money) {
				throw new AccountOverdrawnException("Insufficient funds");
			} else {
				addMoney(money*-1);
			}
		}
}
