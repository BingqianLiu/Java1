 package chapter3;
public class Account {
	private double balance;

	public Account(double intitialBalance) {

		if (intitialBalance > 0)
			balance = intitialBalance;

	}

	public void setBalance(double num) {
		balance = num;
	}

	public double getBalance() {
		return balance;
	}

	public void credit(double amount) {
		balance = balance + amount;

	}

}
