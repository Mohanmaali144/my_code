
import java.util.Scanner;

class Equal
{
	
	public void equal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();			
		if(num1==num2)
			System.out.println("both are Equal  ");
		
		else
			System.out.println("Not Equal  ");
	}
	
	public static void main(String[]args)
	{
		Equal ob = new Equal ();	
		ob.equal();

	}
	
}