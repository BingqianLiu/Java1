package chapter3;
import java.util.Scanner;
public class AccountTest {
public static void main(String[] args){
	Account a1 =new Account(50.00);
	Account a2 =new Account(-50.00);
	
	System.out.println("account1 balance:"+a1.getBalance()  );
	System.out.println("account2 balance:"+a2.getBalance() );

   Scanner s =new Scanner(System.in);
   double depositAmount;
   
   depositAmount=s.nextInt();
   System.out.println("Enter deposit amount for account1:"+depositAmount);
   System.out.println(" adding"+depositAmount+"to account1 blance");
   
   a1.credit( depositAmount );
   a2.credit( depositAmount );
   
   
   System.out.println("account1 balance:"+a1.getBalance()  );
   System.out.println("account2 balance:"+a2.getBalance() );
   
   depositAmount=s.nextInt();
   System.out.println("Enter deposit amount for account2:"+depositAmount);
   System.out.println(" adding"+depositAmount+"to account2 blance");
   
   a1.credit( depositAmount );
   a2.credit( depositAmount );
   
   
   System.out.println("account1 balance:"+a1.getBalance()  );
   System.out.println("account2 balance:"+a2.getBalance() );
   
}
}