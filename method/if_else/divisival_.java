
import java.util.Scanner;

class CheckDivisival
{
	
	public void divisival()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number: ");
		int num2 = sc.nextInt();
		
		if(num1%num2==0)
			System.out.println("Divisival");
		else
			System.out.println("Not Divisival");
	}
	
	public static void main(String[]args)
	{
		CheckDivisival ob = new CheckDivisival();	
		ob.divisival();

	}
	
}