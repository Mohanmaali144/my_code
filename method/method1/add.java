
import java.util.Scanner;

class Test
{
	
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int  a = sc.nextInt();
		
		System.out.println("Enter a Second number: ");
		int  b = sc.nextInt();
		System.out.println("Addition = "+ (a+b));
		
	}
	public static void main(String[]args)
	{
		Test ob = new Test();
		
		ob.add();

	}
}