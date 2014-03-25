package chapter5;
import java.util.Scanner;
public class Interest {
	public static void main (String[] args){
		double amount;
		int year;
		double rate = 0;
		double principle = 0;
		System.out.println("Year   Amount on desposit");
		Scanner s =new Scanner(System.in);
		rate=s.nextDouble();
		principle=s.nextDouble();
		
		
		for(year=1;year<=10;year++){
			amount=principle*Math.pow(1+rate, year);
			System.out.printf("\t%4d %20.2f \n",year,amount);
			
		}
	}

}
