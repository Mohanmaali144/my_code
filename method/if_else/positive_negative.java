
import java.util.Scanner;

class PositiveNegative
{
	
	public void positive()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();		
		
		if(num>0)
			System.out.println(num+" is postive");
		
		else if(num<0)
			System.out.println(num+" is negative");
		else
			System.out.println(num+" is Zero");
	}
	
	public static void main(String[]args)
	{
		PositiveNegative ob = new PositiveNegative ();	
		ob.positive();

	}
	
}