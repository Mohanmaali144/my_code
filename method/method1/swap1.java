
import java.util.Scanner;

class Swap1
{
	
	public void swap()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value of a: " );
		int a= sc.nextInt();	
		System.out.print("Enter value of b: " );
		int b= sc.nextInt();		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a );
		System.out.println("b = "+b );
	}
	
	
	public static void main(String[]args)
	{
		Swap1 ob = new Swap1();	
			ob.swap();

	}
}