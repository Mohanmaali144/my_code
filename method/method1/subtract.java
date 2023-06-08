
import java.util.Scanner;

class Test2
{
	
	public void subtract()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		System.out.println("Subtraction = "+ (a-b));
		
	}
	public static void main(String[]args)
	{
		Test2 ob = new Test2();	
		ob.subtract();

	}
}