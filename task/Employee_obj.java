import java.util.Scanner;

class Employee {
	
	String companyName, name;
	int id;
	double salary;
	
	
	public Employee(String name,double salary,String companyName, int id)
	{
		
		this.name = name ;
		this.companyName = companyName;
		this.salary = salary;
		this.id = id;
	}
	
	public  void setName (String name)
	{
		this.name=name;		
	}
	public  String getName ()
	{
		return this.name;	
	}
	public  void setCompanyName (String companyName)
	{
		this.companyName=companyName;	
	}
	public  String getCompanyName()
	{
		return this.companyName;	
	}
	public  void setId (int Id)
	{
		this.id=id;	
	}
	public int getId()
	{
		return this.id;	
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
}

class Main {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Employee em[] = new Employee[20];
		System.out.println("How many Employee want to enter");
		int n = sc.nextInt();
		int i=1;
		System.out.println("\n----------------------------------------------------------\n");
		while(i<=n)
		{
			//sc.nextLine();
			System.out.println("Enter name");
			String name = sc.nextLine();
			
			System.out.println("Enter salary");
			double salary = sc.nextDouble();
			
			System.out.println("Enter Company name");
			String companyName = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Id");
			int id = sc.nextInt();
			em[i] = new Employee(name,salary,companyName,id);
			
			i++;		
		}
		i=1;
		while(i<=n)
		{
			System.out.println("\n----------------------------------------------------------\n");
			System.out.println("Name = "+em[i].getName());
			System.out.println("CompayName = "+em[i].getCompanyName());
			System.out.println("Id = "+em[i].getId());
			System.out.println("Salary = "+em[i].getSalary());	

			System.out.println("\n----------------------------------------------------------\n");
			
		i++;
		}
	}
}