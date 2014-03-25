package chapter3.HW314;
public class Employee

{

	private String lastName;

	private String firstName;

	private double monthlySalary;

	private double yearlySalary;

	private double totalSalary;

	private int totalMonths = 12;

	private double raise = 0.10;

	public Employee(String last, String first, double monthly)

	{

		lastName = last;
		firstName = first;

		if (monthly > 0.0)

			monthlySalary = monthly;

		yearlySalary = monthlySalary * totalMonths;

		totalSalary = yearlySalary + (yearlySalary * raise);

	}

	public void setLastName(String last)

	{

		lastName = last;
	}

	public String getLastName()

	{

		return lastName;

	}

	public void setFirstName(String first)

	{

		firstName = first; 

	}

	public String getFirstName()

	{

		return firstName;

	}

	public void setMonthlySalary(double monthly)

	{

		if (monthly < 0)

			monthlySalary = 0.0;
		else

			monthlySalary = monthly;

	}

	public double getMonthlySalary() {

		return monthlySalary;

	}

	public void setYearlySalary(double yearly)

	{

		yearlySalary = monthlySalary * totalMonths;

	}

	public double getYearlySalary()

	{

		return yearlySalary;

	}

	public void setTotalSalary(double yearly)

	{

		totalSalary = yearlySalary + (yearlySalary * raise);

	}

	public double getTotalSalary()

	{

		return totalSalary;

	}
}
