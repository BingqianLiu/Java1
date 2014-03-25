package chapter6practice623;

import java.util.Scanner;

public class Minimum {
	public static void main (String[] args) {
		float num1, num2, num3;

		System.out.println("Enter three floating-point values separated by spaces:");
		Scanner s = new Scanner(System.in);
		num1 = s.nextFloat();
		num2 = s.nextFloat();
		num3 = s.nextFloat();
		 
		System.out.println("Result:" +Math.min(num1,Math.min(num2, num3)));
	}

	 
}
