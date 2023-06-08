
import java.util.Scanner;

class Swap3
{
	
	public void swap()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value of a: " );
		int a= sc.nextInt();	
		System.out.print("Enter value of b: " );
		int b= sc.nextInt();		
		int temp =a;
			a=b;
			b=temp;
			
		System.out.println("a = "+a );
		System.out.println("b = "+b );
	}
	
	
	public static void main(String[]args)
	{
		Swap3 ob = new Swap3();	
			ob.swap();

	}
}