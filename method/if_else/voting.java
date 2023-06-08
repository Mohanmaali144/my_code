
import java.util.Scanner;

class Voting
{
	
	public void voting()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();		
		if(age>=18)
			System.out.println("Eligible for voting  ");
		
		else
			System.out.println("Not Eligible for voting  ");
	}
	
	public static void main(String[]args)
	{
		Voting ob = new Voting ();	
		ob.voting();

	}
	
}