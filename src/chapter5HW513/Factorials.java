package chapter5HW513;

public class Factorials {
	public void calculate() {
		int counter = 1;
		long result = 1;
		System.out.println("n\tn!");
		while (counter <= 20) {
			result = counter * result;

			System.out.printf("%d\t%d\n", counter, result);
			counter++;
		}
	}

	public static void main(String[] args) {
		Factorials f = new Factorials();
		f.calculate();
	}

}
