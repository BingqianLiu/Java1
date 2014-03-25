package chapter5;

import java.util.Scanner;

public class GradeBook {
	private String courseName;

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public GradeBook(String name) {
		courseName = name;

	}

	private int total;
	private int counter;
	private int acount;
	private int bcount;
	private int ccount;
	private int dcount;
	private double average;
	private int fcount;
	private static int grade;

	public void display() {
		System.out.println("Welcome to the book:" + courseName);

		Scanner s = new Scanner(System.in);

		while (counter < 2) {
			grade = s.nextInt();
			total = total + grade;

			counter++;
			determinecounter(grade);
		}
		System.out.println(" Total:" + total);
	}

	public void determinecounter(int grade) {

		switch (grade / 10) {
		case 10:
		case 9:
			acount++;
			break;
		case 8:
			bcount++;
			break;
		case 7:
			ccount++;
			break;
		case 6:
			dcount++;
			break;
		default:
			fcount++;
			break;

		}
	}

	public void displaygrade() {
		System.out.println("Grade report:");
		if (counter != 0) {
			double average = (double) total / counter;
			System.out.println("Average:" + average);
			System.out
					.printf("Number of students whos received each grade:\nA:%d \nB:%d \nC:%d \nD:%d \nF:%d",
							acount, bcount, ccount, dcount, fcount);
		} else
			System.out.println("No grades were entered");
	}

}
