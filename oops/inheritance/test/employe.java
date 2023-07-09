import java.util.Scanner;
class Employee
{
	String emp_name;
	double salary;
	public void setData(String emp_name, double salary)
	{
		this.emp_name = emp_name;
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public String getName()
	{
		return this.emp_name;
	}
}
class Bonus extends Employee
{
	private double bonus;
	public void setData(double salary, double bonus)
	{
		this.setData(salary);
		this.bonus = bonus;
	}
	public double addBonus()
	{		
		this.salary = this.salary+this.bonus;
	}
}

class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		Bonus ob = new Bonus();
		
		System.out.println("Enter name of Employee");
		String emp_name = sc.next();
		
		System.out.println("Enter Salary of Employee");
		double salary = sc.nextDouble();
		ob.setData(salary,bonus);		
		ob.getName();
		ob.getSalary();	
		ob.addBonus();
		ob.getSalary();	
	}
}