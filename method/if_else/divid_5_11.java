
import java.util.Scanner;

class Divisible
{
	
	public void divisible()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
					
		if(num%5==0 && num%11==0 )
			System.out.println(num+" is Divisible by 5 and 11 ");
		
		else
			System.out.println("Not Divisble ");
	}
	
	public static void main(String[]args)
	{
		Divisible ob = new Divisible ();	
		ob.divisible();

	}
	
}7