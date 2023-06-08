
import java.util.Scanner;

class Test4
{
	
	public void divid()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		System.out.println("Division = "+ (a/b));
		
	}
	public static void main(String[]args)
	{
		Test4 ob = new Test4();	
		ob.divid();

	}
}