
import java.util.Scanner;

class Test5
{
	
	public void modulas()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		System.out.println("Modulas = "+ (a%b));
		
	}
	public static void main(String[]args)
	{
		Test5 ob = new Test5();	
		ob.modulas();

	}
}