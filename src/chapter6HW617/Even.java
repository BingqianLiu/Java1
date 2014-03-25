package chapter6HW617;

import java.util.Scanner;

public class Even {

	public boolean isEven(int num) {

		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	public void input() {
		int num;
		System.out.printf("%s\n%s\n %s\n %s\n",
				"Enter numbers to determine if they are even or odd.",
				" Please input number:",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter");
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			num = s.nextInt();
			if (isEven(num)) {
				System.out.println(num + " is even");
			} else
				System.out.println(num + " is odd");
		}
	}

	public static void main(String[] args) {
		Even e = new Even();
		e.input();

	}

}