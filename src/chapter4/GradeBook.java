package chapter4;
import java.util.Scanner;
public class GradeBook {
	private String courseName;
	public  GradeBook(String name){
		courseName=name;
	}
	public void setcourseName(String name){
		courseName=name;
		
	}
	public String getcourseName(){
		return courseName;
	}
	public void display(){
		System.out.println("Welcome to this book"+getcourseName());
	}
	public void averge(){
		int grade;
		int totalgrade;
		int averagegrade = 0;
		int counter;
		counter=0;
		totalgrade=0;
		grade=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the grade or -1 to quit:");
		grade=s.nextInt();
		while(grade!=-1){
			totalgrade=totalgrade+grade;
			System.out.println("Enter the grade or -1 to quit:");
			grade=s.nextInt();
			
			counter++;
			
		}
		
		 
		System.out.println("Total:"+totalgrade);
		 
	   if(counter!=0)
	   {
		   averagegrade=totalgrade/counter;
		   System.out.println("Average:"+averagegrade );
		   
	   }
	   else{
		   System.out.println("No enter the grade"  );
	   }
	
	}
	
	

}
