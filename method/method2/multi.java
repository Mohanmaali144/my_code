
import java.util.Scanner;

class Test
{
	public void multi(int a,int b)
	{
		System.out.println("multiplication = "+ (a*b));	
	}
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		
		Test ob = new Test();	
		ob.multi(a,b);

	}
}