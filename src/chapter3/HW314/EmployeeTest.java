package chapter3.HW314;



public class EmployeeTest {

	public static void main(String args[]) {
		 Employee employee1 = new Employee( "bingqian", "liu", 10101.017 );
		  
		       Employee employee2 = new Employee( "xunhu", "sun", -1010.013 );
		 
		        
		 
		       System.out.printf( "Last Name: %s\n", employee1.getLastName() );
		 
		       System.out.printf( "First Name: %s\n", employee1.getFirstName() );
		 
		       System.out.printf( "Monthly Salary: %.2f\n", employee1.getMonthlySalary() );
		 
		       System.out.printf( "Yearly Salary: %.2f\n", employee1.getYearlySalary() );
		 
		       System.out.println();
		 
		        
		 
		       System.out.printf( "Last Name: %s\n", employee2.getLastName() );
		 
		       System.out.printf( "First Name: %s\n", employee2.getFirstName() );
		 
		       System.out.printf( "Monthly Salary: %.2f\n", employee2.getMonthlySalary() );
		 
		       System.out.printf( "Yearly Salary: %.2f\n", employee2.getYearlySalary() );
		 
		       System.out.println();
		 
		       
		 
		      System.out.printf( "Last Name: %s\n", employee1.getLastName() );
		 
		       System.out.printf( "First Name: %s\n", employee1.getFirstName() );
		       
		 
		       System.out.printf( "Total Salary with 10 percent raise: %.2f\n", employee1.getTotalSalary() );
		
		       System.out.println();
		
		        
		 
		       System.out.printf( "Last Name: %s\n", employee2.getLastName() );
		
		       System.out.printf( "First Name: %s\n", employee2.getFirstName() );
		       
		 
		     System.out.printf( "Total Salary with 10 percent raise: %.2f\n", employee2.getTotalSalary() );
		
		       System.out.println();   
		
		    }  
		 
		 }  
		 