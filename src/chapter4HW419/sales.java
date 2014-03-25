package chapter4HW419;
import java.util.Scanner;
public class sales {

public void display()
{
	 
	double gross;
	double total;
	int num;
	double num1=0,num2=0,num3=0,num4=0;
	int product=0;
	while(product<4)
	{
		product++;
		System.out.println("Enter number sold of product"+product+" :" );
		Scanner s1 =new Scanner(System.in);
		num=s1.nextInt();
		
		
		if (product==1)
			 
            num1 =  num  * 239.99;
         else if ( product == 2 )
            num2 =  num  * 129.75;
         else if ( product == 3 )
            num3 =  num * 99.95;
         else if ( product == 4 )
            num4 =  num  * 350.89;

		
	 
		}
	gross=num1+num2+num3+num4;
	
		 total = 0.09 * gross + 200;
	

	 
	
	System.out.printf("Earnings this week:%.2f",total);  
	
		
}

public static void main(String [] args){
	sales s =new sales();
	s.display();
}
}
