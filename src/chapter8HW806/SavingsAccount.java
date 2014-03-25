package chapter8HW806;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double balance) {
		savingsBalance = balance;
	}

	public double calculateBalance() {
		savingsBalance += savingsBalance * annualInterestRate / 12;

		return savingsBalance;
	}

	public static void modifyInterestRate(double newrate) {
		annualInterestRate = newrate;
	}

}
