import java.util.Scanner;

class Employee
{
	double salary;
	String name;
	double time;
	
	public Employee()
	{
		this.salary = 0;
		this.name	= "";
		this.time   = 0.0f;
	}
	
	public Employee(double salary,String name,float time)
	{
		this.salary = salary;
		this.name	= name;
		this.time   = time;
	}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }		
}

class  FullTimeEmployee extends Employee
{
    public FullTimeEmployee(double salary,String name,float time)
    {
        super(salary,name,time);
    }

}
class HalfTimeEmployee extends Employee
{

    public HalfTimeEmployee(double salary,String name,float time)
    {
        super(salary,name,time);
    }
}
   
class Main
{
      public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee(25000,"Aashis",6f);
        HalfTimeEmployee emp2 = new HalfTimeEmployee(12000,"Kapil",3f);
        
        System.out.println("--------- Full Time Employee ----------");
        System.out.println("Name : "+emp1.getName());
        System.out.println("Time : "+emp1.getTime());
        System.out.println("Salary : "+emp1.getSalary());
      
        System.out.println("--------- Half Time Employee ----------");

        System.out.println("Name : "+emp2.getName());
        System.out.println("Time : "+emp2.getTime());
        System.out.println("Salary : "+emp2.getSalary());
      }
}

