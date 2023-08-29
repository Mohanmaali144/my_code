package personemployee;
import persondata.PersonData;
public class Employee extends PersonData
{
	private String id;
	private double salary ;
	public void setId(String id)
	{
		this.id = id;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void addBonus(double bonus)
	{	
		this.salary = this.salary + (bonus*this.salary/100);
	}
}