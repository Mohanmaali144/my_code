//single 
import java.util.Scanner;
class Person
{
	String name;
	float height;
	int age;
	int weight;
	String gender;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHeight(float height)
	{
		this.height = height;
	}
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public void setGender(String gender)
	{	
		this.gender = gender;
	}
	public void setAge(int age)
	{	
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}
	public float getHeight()
	{
		return this.height;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getGender()
	{
		return this.gender;
	}	
}
class Employee extends Person
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
class Main
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);	
		Employee ob = new Employee();
		
		System.out.println("Enter name of Person");
		ob.setName(sc.next());
		
		System.out.println("Enter Height of Person");
		ob.setHeight(sc.nextFloat());
		
		System.out.println("Enter weight of Person");
		ob.setWeight(sc.nextInt());
		
		System.out.println("Enter age of Person");
		ob.setAge(sc.nextInt());
		String gender ;
		do{
			System.out.println("Enter Gender of Person");
			gender = sc.next();
			if(!gender.equals("male")&& !gender.equals("female"))
				System.out.println("invalid gender"); 
		}while(!gender.equals("male") && !gender.equals("female")); 
		ob.setGender(gender);
		ob.setId("91234");
		ob.setSalary(25000);
		System.out.println(ob.getSalary());	
		System.out.println("Enter bonus in persantage");
		double bonus = sc.nextDouble();
		ob.addBonus(bonus);
		System.out.println("salary = "+ob.getSalary());
	}
	
}