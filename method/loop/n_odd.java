
import java.util.Scanner;

class Odd
{  
	public void odd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i =1;
		while(i<=n)
		{	
			System.out.print((i*2-1)+" ");
		i++;
		}	
	}		
	public static void main(String[]args)
	{
		Odd ob = new Odd();	
		ob.odd();	
	}	
}