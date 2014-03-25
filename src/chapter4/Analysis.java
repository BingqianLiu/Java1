package chapter4;

import java.util.Scanner;

public class Analysis {

	public void display() {
		int pass = 0;
		int fail = 0;
		int num;
		int counter = 0;

		while (counter < 10) {
			System.out.println("Enter result(1=pass,2=fail):");
			Scanner s = new Scanner(System.in);

			num = s.nextInt();

			if (num == 1)
			{
				pass++;
			} 
			else if (num == 2) {
				fail++;
			}
			counter++;
		}
		System.out.println("pass:" + pass);
		System.out.println("fail:" + fail);

	}

	public static void main(String[] args) {
		Analysis a = new Analysis();
		a.display();

	}
}
