package chapter8HW806;

public class SavingsAccountTest {


	public static void main(String args[]) {
		int month ;
		SavingsAccount saver1 = new SavingsAccount(2000);

		SavingsAccount saver2 = new SavingsAccount(3000);

		System.out.println("Set annualInterestRate to 4% ");
		SavingsAccount.modifyInterestRate(.04);
		System.out.println("Saving Balance:\nMonth\tsaver1\tsaver2");
		for (month = 1; month <= 12; month++) {
			System.out.printf("%d\t%.2f\t%.2f\n", month,
					saver1.calculateBalance(), saver2.calculateBalance());
		}
		System.out.println();
		System.out.println("Set annualInterestRate to 5% ");
		SavingsAccount.modifyInterestRate(.05);
		System.out.println("Saving Balance:\nMonth\tsaver1\tsaver2");
		for (month = 13; month <= 13; month++) {
			System.out.printf("%d\t%.2f\t%.2f\n", month,
					saver1.calculateBalance(), saver2.calculateBalance());
		}

	}
}
