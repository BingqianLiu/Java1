package chapter4;
import java.util.Scanner;

public class CounterGrade {
	private String courseName;

	public CounterGrade(String name) {
		courseName = name;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void display() {
		System.out.printf("\nWelcome to the grade book for\n%s!",
				getCourseName()); 
	}

	public void avergeGrade() {
		int grade;
		int total;
		int counter;
		int average;
		Scanner s = new Scanner(System.in);
		total = 0;
		counter = 1;
		while (counter <= 10) {
			System.out.println("\nEnter Grade:");
			grade = s.nextInt();
			total = grade + total;
			counter++;
		}
		average = total / 10;
		System.out.printf("\nTotal:%d", total);
		System.out.printf("\nAverage:" + average);

	}
}
