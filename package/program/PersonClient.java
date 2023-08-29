import java.util.Scanner;
import personemployee.Employee;
public class PersonClient
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