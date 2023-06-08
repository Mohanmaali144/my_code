
import java.util.Scanner;

class Test3
{
	
	public void multi()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		System.out.println("multiplication = "+ (a*b));
		
	}
	public static void main(String[]args)
	{
		Test3 ob = new Test3();	
		ob.multi();

	}
}