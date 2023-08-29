package bin;
import java.io.*;
public class Employee implements Serializable {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(String name,int id, double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	public String getName ()
	{
		return this.name;
	}
	
	public void setId (int id)
	{
		this.id = id;
	}
	public int getId ()
	{
		return this.id;
	}
	
	public void setSalary (double salary)
	{
		this.salary= salary;
	}
	public double getSalary ()
	{
		return this.salary;
	}	
}

